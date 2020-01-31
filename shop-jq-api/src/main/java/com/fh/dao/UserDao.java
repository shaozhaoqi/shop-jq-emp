package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.bean.po.Dept;
import com.fh.bean.po.User;
import com.fh.utils.PageBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<User> {
    Long queryCount();

    List<User> queryList(PageBean<User> page);

    List<Dept> queryDeptList();

    Dept queyrLeader(Integer id);

    User queryUser();
}
