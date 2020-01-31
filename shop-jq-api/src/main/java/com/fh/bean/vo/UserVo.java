package com.fh.bean.vo;

import lombok.Data;

import java.util.Date;
@Data
public class UserVo {
    private Integer id;
    private Double salary;
    private String jobName;
    private Date showTime;
    private String deptName;
    private String userName;
    private String leaderName;
}
