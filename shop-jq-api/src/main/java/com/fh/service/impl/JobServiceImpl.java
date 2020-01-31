package com.fh.service.impl;

import com.fh.bean.po.Job;
import com.fh.dao.JobDao;
import com.fh.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Resource
    private JobDao jobDao;

    @Override
    public List<Job> queryClassList() {
        return jobDao.selectList(null);
    }
}
