package com.service;

import com.entity.Users;
import com.mapper.UsersMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "usersService")
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public List<Users> findUsers() {
        return usersMapper.findUsers();
    }

    @Override
    public Users findUsersById(Integer u_id) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("u_id",u_id);
        List<Users> users = usersMapper.findUsersById(map);
        Users u1 = new Users();
        for(Users user : users){
            u1.setU_id(user.getU_id());
            u1.setU_name(user.getU_name());
            u1.setAddress(user.getAddress());
            u1.setBirthday(user.getBirthday());
            u1.setDep_id(user.getDep_id());
            u1.setIdentityCard(user.getIdentityCard());
            u1.setPassword(user.getPassword());
            u1.setPhone(user.getPhone());
            u1.setPos_id(user.getPos_id());
            u1.setS_ban(user.getS_ban());
            u1.setSex(user.getSex());
            u1.setU_remarks(user.getU_remarks());
            u1.setU_state(user.getU_state());
            u1.setWorkId(user.getWorkId());
            u1.setX_ban(user.getX_ban());
            u1.setDep_name(user.getDep_name());
            u1.setPos_name(user.getPos_name());
        }
        return u1;
    }

    @Override
    public void deleteUsersById(Integer u_id) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("u_id",u_id);
        usersMapper.deleteUsersById(map);
    }

    @Override
    public void updateUsers(Users users) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("sex",users.getSex());
        map.put("birthday",users.getBirthday());
        map.put("phone",users.getPhone());
        map.put("address",users.getAddress());
        map.put("dep_id",users.getDep_id());
        map.put("pos_id",users.getPos_id());
        map.put("identityCard",users.getIdentityCard());
        map.put("u_id",users.getU_id());
        map.put("password",users.getPassword());
        map.put("s_ban",users.getS_ban());
        map.put("x_ban",users.getX_ban());
        usersMapper.updateUsers(map);
    }

    @Override
    public void addUsers(Users user) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("u_name",user.getU_name());
        map.put("workId",user.getWorkId());
        map.put("sex",user.getSex());
        map.put("birthday",user.getBirthday());
        map.put("phone",user.getPhone());
        map.put("address",user.getAddress());
        map.put("dep_id",user.getDep_id());
        map.put("pos_id",user.getPos_id());
        map.put("s_ban",user.getS_ban());
        map.put("x_ban",user.getX_ban());
        map.put("u_remarks",user.getU_remarks());
        map.put("identityCard",user.getIdentityCard());
        map.put("password",user.getPassword());
        usersMapper.addUsers(map);
    }
}
