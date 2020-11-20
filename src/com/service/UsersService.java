package com.service;

import com.entity.Users;

import java.util.List;

public interface UsersService {
    List<Users> findUsers();

    Users findUsersById(Integer u_id);

    void deleteUsersById(Integer u_id);

    void updateUsers(Users users);

    void addUsers(Users user);
}
