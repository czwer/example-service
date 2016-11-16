package com.example.dal.dao;

import com.example.dtos.ReportDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xxx
 * Date: 16/11/15
 * Time: 下午10:39
 */
public interface ReportDAO {

    @Select("select * from report order by id desc limit 0,10")
    List<ReportDTO> queryLastTenReport();
}
