package com.example.test;

import com.example.service.BaseServiceTest;
import com.example.service.QueryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: xxx
 * Date: 16/11/15
 * Time: 下午8:52
 */
public class QueryServiceTest extends BaseServiceTest {
    @Autowired
    private QueryService queryService;

    @Test
    public void testQueryIsSuccess(){
        String result = queryService.queryIsSuccess();
        System.out.println("**********************************************");
        System.out.println(result);
        System.out.println("**********************************************");
    }
}
