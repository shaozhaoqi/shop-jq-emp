package com.fh.bean.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("jq_dept")
@Data
public class Dept {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String deptName;
    private String leaderName;
}
