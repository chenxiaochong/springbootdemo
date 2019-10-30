package cn.cxc.globalexceptiondemo.controller;

import cn.cxc.globalexceptiondemo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chenxiaochong
 * @date 2019/10/29 20:28
 */
@Controller
public class MyController {

    @Autowired
    MyService myService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String Test() {
        return myService.Test();
    }
}
