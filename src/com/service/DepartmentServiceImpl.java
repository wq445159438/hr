package com.service;

import com.entity.Department;
import com.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "departmentService")
public class DepartmentServiceImpl implements DepartmentService{

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findDepartment() {
        return departmentMapper.findDepartment();
    }
}
