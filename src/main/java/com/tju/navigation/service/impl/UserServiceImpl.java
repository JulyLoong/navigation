package com.tju.navigation.service.impl;

import com.tju.navigation.bean.Resource;
import com.tju.navigation.bean.User;
import com.tju.navigation.dao.UserDao;
import com.tju.navigation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/04/19
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean usernameExists(String username) {
        User user = userDao.getUserByUsername(username);
        return user != null;
    }

    @Override
    public int saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public User getUser(User loginUser) {
        return userDao.getUser(loginUser);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addResource(Resource resource) {
        userDao.addResource(resource);
    }

    @Override
    public List<Resource> getResourcesByContributorid(Integer contributorid) {
        return userDao.getResourcesByContributorid(contributorid);
    }

    @Override
    public void resourceFrequencyPlus(String id) {
        userDao.resourceFrequencyPlus(id);
    }

    @Override
    public void pointsPlus(String id, int i) {
        userDao.pointsPlus(id, i);
    }

}