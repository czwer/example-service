package com.example.service;

import com.example.dtos.ReportDTO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xxx
 * Date: 16/11/15
 * Time: 下午10:39
 */
public interface ReportQueryService {
    /**
     * 查询最后十条的报告，如果不足十条，有几条返回几条
     * @return
     */
    List<ReportDTO> queryLastTenReport();
}
