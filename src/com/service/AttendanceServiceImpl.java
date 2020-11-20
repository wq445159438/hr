package com.service;

import com.entity.Attendance;
import com.mapper.AttendanceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service(value = "attendanceService")
public class AttendanceServiceImpl implements AttendanceService {

    @Resource
    private AttendanceMapper attendanceMapper;

    @Override
    public Attendance findAttendanceByu_id(Integer u_id) {
        return attendanceMapper.findAttendanceByu_id(u_id);
    }

    @Override
    public void addAttendanceS_ban(Integer u_id, Integer i) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("u_id",u_id);
        map.put("i",i);
        System.out.println(map.get("u_id"));
        System.out.println(map.get("i"));
        attendanceMapper.addAttendanceS_ban(map);
    }

    @Override
    public void updateAttendanceX_ban(Integer u_id, int i) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("u_id",u_id);
        map.put("i",i);
        attendanceMapper.updateAttendanceX_ban(map);
    }
}
