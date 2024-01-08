package com.user.userTask.services;

import com.user.userTask.model.User;

import java.util.List;

public interface UserService {

    public List<User> getUser();
    public User getUser(long Id);
    public User addUser(User user);
    public User updateUser(User user);
    public void deleteUser(long userId);

}
