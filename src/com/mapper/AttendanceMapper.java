package com.mapper;

import com.entity.Attendance;

import java.util.Map;

public interface AttendanceMapper {
    Attendance findAttendanceByu_id(Integer u_id);

    void addAttendanceS_ban(Map<String,Object> map);

    void updateAttendanceX_ban(Map<String,Object> map);
}
