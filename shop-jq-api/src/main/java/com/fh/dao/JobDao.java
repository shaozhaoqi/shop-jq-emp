package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.bean.po.Job;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobDao extends BaseMapper<Job> {
}
