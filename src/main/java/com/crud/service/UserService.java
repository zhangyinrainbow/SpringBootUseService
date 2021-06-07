package com.crud.service;

import com.crud.entity.User;

import java.util.List;

/**
 * 这里是没有@Service备注的
 * **/
public interface UserService {
    User getUserById(Integer id);
    List<User> getAllUser();
    boolean insertUser(User user);
    boolean deleteUserById(Integer id);
    boolean updateUser(User user);
}
