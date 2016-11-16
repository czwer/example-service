package com.example.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: xxx
 * Date: 16/11/15
 * Time: 下午10:31
 * 该DTO对应cat中report表,用于测试DAO是否被cat监控
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReportDTO implements Serializable{
    /**
     * 主键Id
     */
    private int id;
    /**
     * 报表类型(默认1)
     * @see com.example.constants.ReportType
     */
    private int type;
    /**
     * 报表名称
     */
    private String name;
    /**
     * 报表来自于那台机器
     */
    private String ip;
    /**
     * 报表项目
     */
    private String domain;
    /**
     * 报表时间段
     */
    private Date period;
    /**
     * 报表创建时间
     */
    private Date creation_date;

}
