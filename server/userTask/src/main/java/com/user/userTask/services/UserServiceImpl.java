package com.user.userTask.services;

import com.user.userTask.dao.UserDao;
import com.user.userTask.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    @Autowired(required = true)
    protected UserDao userDao;
    List<User> list;


    public UserServiceImpl(UserDao userDao) {
        //this.userDao = userDao;
//        list = new ArrayList<>();
//        list.add(new User(2L, "Aman", "abc.gamil.com", "Reading", true));
//        list.add(new User(1L, "Chaman", "cuy.gamil.com", "Study", false));
    }

    @Override
    public List<User> getUser() {
        return userDao.findAll();
    }

    @Override
    public User getUser(long userId) {
        return userDao.getById(userId);
    }

    @Override
    public User addUser(User user) {
        userDao.save(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        userDao.save(user);
        return user;
    }

    @Override
    public void deleteUser(long userId) {
        User entity = userDao.getOne(userId);
        userDao.delete(entity);
        //return "User";
    }
}
