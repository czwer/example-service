package com.example.dal;

import com.dianping.cat.Cat;
import com.dianping.cat.message.Transaction;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

@Intercepts(value =
        {@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        })
public class CatSelectInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        String[] ids = StringUtils.split(mappedStatement.getId(), ".");
        String proxyMethodId = ids[ids.length - 2] + "." + ids[ids.length - 1];
        Transaction transaction = Cat.newTransaction("DAO", proxyMethodId);
        try {
            Object proceed = invocation.proceed();
            transaction.setStatus(Transaction.SUCCESS);
            return proceed;
        } catch (Exception e) {
            transaction.setStatus(e);
            Cat.logError(e);
            throw e;
        } finally {
            transaction.complete();
        }
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}