package com.example.service.impl;

import com.example.service.QueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: xxx
 * Date: 16/11/12
 * Time: 下午11:48
 */
@Slf4j
@Service("queryService")
public class QueryServiceImpl implements QueryService {


    public String queryIsSuccess() {
        String info = "恭喜，dubbo success!";
        log.info(info);
        return info;
    }
}
