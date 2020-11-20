package com.mapper;

import com.entity.Users;

import java.util.List;
import java.util.Map;

public interface UsersMapper {
    List<Users> findUsers();

    List<Users> findUsersById(Map<String,Object> map);

    void deleteUsersById(Map<String,Object> map);

    void updateUsers(Map<String,Object> map);

    void addUsers(Map<String,Object> map);
}
