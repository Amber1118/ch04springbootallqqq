package com.qf.service;

import com.qf.mapper.UserMapper;
import com.qf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUpwdByUname(String uname) {
        return userMapper.getUpwdByUname(uname);
    }

    @Override
    public String getRoleByUname(String uname) {
        return userMapper.getRoleByUname(uname);
    }

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public int deleteUser(int uid) {
        return userMapper.deleteUser(uid);
    }

    @Override
    public User getUserByUid(int uid) {
        return userMapper.getUserByUid(uid);
    }

    @Override
    public int updataUser(User user) {
        return userMapper.updataUser(user);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
