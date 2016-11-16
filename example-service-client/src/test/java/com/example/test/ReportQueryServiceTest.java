package com.example.test;

import com.example.dtos.ReportDTO;
import com.example.service.BaseServiceTest;
import com.example.service.ReportQueryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xxx
 * Date: 16/11/15
 * Time: 下午10:53
 */
public class ReportQueryServiceTest extends BaseServiceTest {
    @Autowired
    private ReportQueryService reportQueryService;

    @Test
    public void testQueryLastTenReport(){
        List<ReportDTO> reportDTOList = reportQueryService.queryLastTenReport();
        System.out.println("**********************************************");
        for(ReportDTO reportDTO : reportDTOList){
            System.out.println(reportDTO);
        }
        System.out.println("**********************************************");
    }

}
