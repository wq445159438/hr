package com.controller;

import com.entity.Attendance;
import com.entity.Users;
import com.service.AttendanceService;
import com.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class AttendanceController {

    @Resource
    private AttendanceService attendanceService;

    @Resource
    private UsersService usersService;

    @RequestMapping("/sBan")
    public String sBan(Integer u_id, HttpSession session, Model model){
        Users user = new Users();
        user.setU_id(u_id);
        Attendance attendance = attendanceService.findAttendanceByu_id(user.getU_id());
        if(attendance==null){
            user = usersService.findUsersById(u_id);
            Date sbanTime = user.getS_ban();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
            String sban = sdf.format(sbanTime);
            String time = sdf.format(date);
            int result = time.compareTo(sban);
            if(result < 0){
                attendanceService.addAttendanceS_ban(u_id,0);
                model.addAttribute("result","上班打卡成功.");
            }else{
                attendanceService.addAttendanceS_ban(u_id,1);
                model.addAttribute("result","上班打卡成功,您已迟到!");
            }
            session.setAttribute("beginTime",time);
        }
        return "sBan";
    }

    @RequestMapping("/xBan")
    public String xBan(Integer u_id, HttpSession session, Model model){
        Users user = new Users();
        user.setU_id(u_id);
        Attendance attendance = attendanceService.findAttendanceByu_id(user.getU_id());
        if(attendance!=null){
            user = usersService.findUsersById(u_id);
            Date xbanTime = user.getX_ban();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String xban = sdf.format(xbanTime);
            String time = sdf.format(date);
            int result = time.compareTo(xban);
            if(result >= 0){
                attendanceService.updateAttendanceX_ban(u_id,0);
                model.addAttribute("result","下班打卡成功.");
            }else{
                attendanceService.updateAttendanceX_ban(u_id,1);
                model.addAttribute("result","下班打卡成功,您已早退!");
            }
            session.setAttribute("endTime",time);
        }
        return "sBan";
    }
}
