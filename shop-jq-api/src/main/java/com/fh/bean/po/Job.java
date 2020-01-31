package com.fh.bean.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("jq_job")
@Data
public class Job {
    @TableId(value = "id",type = IdType.AUTO )
    private Integer id;
    private String jobName;
}
