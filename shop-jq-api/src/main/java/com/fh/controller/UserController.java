package com.fh.controller;

import com.fh.bean.po.Dept;
import com.fh.bean.po.User;
import com.fh.service.UserService;
import com.fh.utils.ExceUtils;
import com.fh.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryPageList")
    public PageBean<User> queryPageList(PageBean<User> page){
           userService.queryPageList(page);
        return page;
    }

    @RequestMapping("/addUser")
    public User addUser(User user){
        userService.addUser(user);
        return user;
    }

    @RequestMapping("/delUser")
    public void delUser(Integer id){
        userService.delUser(id);
    }
    @RequestMapping("/importExcel")
    public void importExcel( HttpServletResponse response){
        List<User> list=userService.queryUser();
        ExceUtils.excelUtil(list,response);
    }
    @RequestMapping("/queryDeptList")
    public Map queryDeptList(){
        Map map=new HashMap();
        List<Dept> deptList=userService.queryDeptList();
        map.put("data",deptList);
        return map;
    }
    @RequestMapping("/queryleader")
    public Map queryleader(Integer id){
        Map map=new HashMap();
        Dept deptList=userService.queyrLeader(id);
        map.put("data",deptList);
        return map;
    }
    @RequestMapping("/queryUserId")
    public Map queryUserId(Integer id){
        Map map=new HashMap();
        User u=userService.queryUserId(id);
        map.put("data",u);
        return map;
    }
    @RequestMapping("updateUser")
    public User updateUser(User user){
        userService.updateUser(user);
         return user;
    }
}
