package com.example.service.impl;

import com.example.dal.dao.ReportDAO;
import com.example.dtos.ReportDTO;
import com.example.service.ReportQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xxx
 * Date: 16/11/15
 * Time: 下午10:41
 */
@Slf4j
@Service("reportQueryService")
public class ReportQueryServiceImpl implements ReportQueryService {

    @Autowired
    private ReportDAO reportDAO;

    @Override
    public List<ReportDTO> queryLastTenReport() {
        List<ReportDTO> reportDTOList =  reportDAO.queryLastTenReport();
        if(CollectionUtils.isEmpty(reportDTOList)){
            return Collections.emptyList();
        }
        return reportDTOList;
    }
}
