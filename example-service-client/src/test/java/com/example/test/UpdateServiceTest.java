package com.example.test;

import com.example.service.BaseServiceTest;
import com.example.service.UpdateService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: xxx
 * Date: 16/11/15
 * Time: 下午8:53
 */
public class UpdateServiceTest extends BaseServiceTest {
    @Autowired
    private UpdateService updateService;

    @Test
    public void testSum(){
        int sum = updateService.sum(1, 2);
        System.out.println("**********************************************");
        System.out.println(sum);
        System.out.println("**********************************************");
    }
}
