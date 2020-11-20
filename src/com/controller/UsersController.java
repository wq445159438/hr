package com.controller;

import com.entity.Department;
import com.entity.Position;
import com.entity.Users;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.service.DepartmentService;
import com.service.PositionService;
import com.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UsersController {

    @Resource
    private UsersService usersService;

    @Resource
    private DepartmentService departmentService;

    @Resource
    private PositionService positionService;


    @RequestMapping("/findUsers")
    public String findUsers(Model model){
        List<Users> list = usersService.findUsers();
        model.addAttribute("users1", list);
        return "usersList";
    }

    @RequestMapping("/findUsersById")
    public String findUsersById(Model model, Integer u_id){
        Users user = usersService.findUsersById(u_id);
        model.addAttribute("users", user);
        return "usersDetails";
    }

    @RequestMapping("/deleteUsersById")
    public String deleteUsersById(Integer u_id){
        usersService.deleteUsersById(u_id);
        return "redirect:/findUsers";
    }

    @RequestMapping("/updateUsersUI")
    public String updateUsersUI(Integer u_id, Model model){
        List<Department> departmentList = departmentService.findDepartment();
        List<Position> positionList = positionService.findPosition();
        Users user = usersService.findUsersById(u_id);
        model.addAttribute("users", user);
        model.addAttribute("departmentList", departmentList);
        model.addAttribute("positionList", positionList);
        return "usersUpdate";
    }

    @RequestMapping("/updateUsers")
    public String updateUsers(Users users,String pwd){
        users.setPassword(pwd);
        usersService.updateUsers(users);
        return "redirect:/findUsers";
    }

    @RequestMapping("/addUsersUI")
    public String addUsersUI(Model model){
        List<Department> departmentList = departmentService.findDepartment();
        List<Position> positionList = positionService.findPosition();
        model.addAttribute("departmentList", departmentList);
        model.addAttribute("positionList", positionList);
        return "usersAdd";
    }

    @RequestMapping("/addUsers")
    public String addUsers(Users user){
        usersService.addUsers(user);
        return "redirect:/findUsers";
    }
}
