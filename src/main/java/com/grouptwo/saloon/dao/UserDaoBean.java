package com.grouptwo.saloon.dao;

import com.grouptwo.saloon.model.User;
import com.grouptwo.saloon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoBean implements UserDao {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> listUser() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
