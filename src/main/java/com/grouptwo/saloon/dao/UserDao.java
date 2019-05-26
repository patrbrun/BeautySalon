package com.grouptwo.saloon.dao;

import com.grouptwo.saloon.model.User;

public interface UserDao {
    Iterable<User> listUser();

    void deleteUser(Integer userId);

    User getUserById(Integer userId);

    User save(User user);
}
