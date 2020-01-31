package com.fh.bean.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fh.commons.ExcelAnnotation;
import com.fh.commons.ExcleHeard;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("jq_user")
@Data
@ExcleHeard(title = "员工表")
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @ExcelAnnotation(name = "薪资")
    private Double salary;
    @ExcelAnnotation(name = "岗位")
    private Integer jobId;
    @ExcelAnnotation(name = "入职时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date showTime;
    @ExcelAnnotation(name = "部门")
    private Integer deptId;
    @ExcelAnnotation(name = "员工姓名")
    private String userName;
    @ExcelAnnotation(name = "领导名称")
    private String leaderName;
}
