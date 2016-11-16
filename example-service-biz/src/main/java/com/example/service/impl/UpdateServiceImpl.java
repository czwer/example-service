package com.example.service.impl;

import com.example.service.UpdateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: xxx
 * Date: 16/11/12
 * Time: 下午11:53
 */
@Slf4j
@Service("updateService")
public class UpdateServiceImpl implements UpdateService {
    public int sum(int a, int b) {
        log.info("收到请求：a:{}，b:{}",a,b);
        return a+b;
    }
}
