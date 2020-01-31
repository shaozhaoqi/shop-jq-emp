package com.fh.service.impl;

import com.fh.bean.po.Dept;
import com.fh.bean.po.User;
import com.fh.dao.UserDao;
import com.fh.service.UserService;
import com.fh.utils.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public void queryPageList(PageBean<User> page) {
        Long count=userDao.queryCount();
        page.setRecordsTotal(count);
        page.setRecordsFiltered(count);
        List<User> list=userDao.queryList(page);
        page.setList(list);
    }

    @Override
    public void addUser(User user) {
            userDao.insert(user);
    }

    @Override
    public void delUser(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public List <User> queryUser() {
        return userDao.selectList(null);
    }

    @Override
    public List<Dept> queryDeptList() {
        return userDao.queryDeptList();
    }

    @Override
    public Dept queyrLeader(Integer id) {
        return userDao.queyrLeader(id);
    }

    @Override
    public User queryUserId(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateById(user);
    }

}
