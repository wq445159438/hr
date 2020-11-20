package com.service;

import com.entity.Attendance;

public interface AttendanceService {
    Attendance findAttendanceByu_id(Integer u_id);

    void addAttendanceS_ban(Integer u_id, Integer i);

    void updateAttendanceX_ban(Integer u_id, int i);
}
