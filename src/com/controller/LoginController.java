package com.controller;

import com.entity.*;
import com.service.AttendanceService;
import com.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


//人事信息
@Controller
public class LoginController {

    @Resource
    private LoginService loginService;

    @Resource
    private AttendanceService attendanceService;


    @RequestMapping("/login")
    public String login(Users user, HttpSession session) throws Exception{
        Users login_ = loginService.login(user);
        if(login_ != null){
            session.setAttribute("login", login_);
            Attendance attendance = attendanceService.findAttendanceByu_id(login_.getU_id());
            if(attendance != null){
                if(attendance.getAtt_s_ban() != null){
                    session.setAttribute("beginTime",attendance.getAtt_s_ban());
                }
                if(attendance.getAtt_x_ban() != null){
                    session.setAttribute("endTime",attendance.getAtt_x_ban());
                }
            }
            return "main";
        }
        return "redirect:/login.jsp";
    }

    @RequestMapping("/quit")
    public String quit(HttpSession session){
        session.removeAttribute("login");
        session.removeAttribute("beginTime");
        session.removeAttribute("endTime");
        return "redirect:/login.jsp";
    }



}
