package com.xawl.car.controller;

import com.mysql.fabric.xmlrpc.base.Data;
import com.xawl.car.pojo.DbBuser;
import com.xawl.car.service.BUserService;
import com.xawl.car.utils.CarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by Administrator on 2017/3/25.
 */
@Controller
@RequestMapping("/car")
public class BUserContorller {

    @Autowired
    private BUserService bUserService;

    @ResponseBody
    @RequestMapping("/login.action")
    public CarResult login(DbBuser buser, HttpSession session, HttpServletRequest request, HttpServletResponse response){
        CarResult result = bUserService.login(buser);
        if (result.getStatus() == 200){
            String uuid = UUID.randomUUID().toString();
            session.setAttribute(uuid, buser);
            Cookie cookie = new Cookie(buser.getBuser(),uuid+new Data());
            cookie.setPath("/");
            response.addCookie(cookie);
        }
        return result;
    }
    @ResponseBody
    @RequestMapping("/adduser.action")
    public CarResult addUser(DbBuser buser){
        CarResult result = bUserService.addUser(buser);
        return result;
    }

}
