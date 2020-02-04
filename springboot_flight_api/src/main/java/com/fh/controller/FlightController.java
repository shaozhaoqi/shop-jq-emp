package com.fh.controller;

import com.fh.model.*;
import com.fh.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("flight")
@CrossOrigin
public class FlightController {
    @Autowired
    private FlightService flightService;
    @RequestMapping("queryFlight")
    @ResponseBody
    public Bean<Flight> queryFlight(Bean<Flight> bean){
        flightService.queryFlight(bean);
        return bean;
    }
    @RequestMapping("xiala1")
    @ResponseBody
    public List<Area> xiala1(){
        List<Area> list=flightService.xiala1();
        return list;
    }
    @RequestMapping("xiala2")
    @ResponseBody
    public List<Area> xiala2(int id){
        List<Area> list=flightService.xiala2(id);
        return list;
    }
    @RequestMapping("xiala3")
    @ResponseBody
    public List<Area> xiala3(int id){
        List<Area> list=flightService.xiala3(id);
        return list;
    }
    @RequestMapping("xialaa")
    @ResponseBody
    public List<Area> xialaa(){
        List<Area> list=flightService.xialaa();
        return list;
    }
    @RequestMapping("xialab")
    @ResponseBody
    public List<Area> xialab(int id){
        List<Area> list=flightService.xialab(id);
        return list;
    }
    @RequestMapping("xialac")
    @ResponseBody
    public List<Area> xialac(int id){
        List<Area> list=flightService.xialac(id);
        return list;
    }
    @RequestMapping("queryJixing")
    @ResponseBody
    public List<Type> queryJixing(){
        List<Type> list=flightService.queryJixing();
        return list;
    }
    @RequestMapping("queryJipiao")
    @ResponseBody
    public List<TicketName> queryJipiao(){
        List<TicketName> list=flightService.queryJipiao();
        return list;
    }
    @RequestMapping("addflight")
    @ResponseBody
    public void addflight(Flight flight){
        flightService.addflight(flight);
    }
    @RequestMapping("shanchu")
    @ResponseBody
    public void shanchu(int id){
        flightService.shanchu(id);
    }
    @RequestMapping("toUpdate")
    @ResponseBody
    public Flight toUpdate(int id){
       Flight flight= flightService.toUpdate(id);
       return flight;
    }
    @RequestMapping("updateflight")
    @ResponseBody
    public void updateflight(Flight flight){
        flightService.updateflight(flight);
    }
}
