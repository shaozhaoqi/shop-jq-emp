package com.fh.controller;

import com.fh.bean.po.Job;
import com.fh.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/job")
@CrossOrigin
@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping("/queryJobList")
    public Map queryClassList(){
        Map map=new HashMap();
        List<Job> jobList=jobService.queryClassList();
        map.put("data",jobList);
        return map;
    }
}
