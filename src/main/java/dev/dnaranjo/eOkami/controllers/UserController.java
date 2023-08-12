package dev.dnaranjo.eOkami.controllers;

import dev.dnaranjo.eOkami.dao.UserDao;
import dev.dnaranjo.eOkami.models.User;
import dev.dnaranjo.eOkami.utils.JWTUtil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;
    @Autowired
    private JWTUtil jwtUtil;

    private boolean validateToken(String token) {
        String userId = jwtUtil.getKey(token);
        return userId != null;
    }

    // @RequestMapping(value="api/users", method = RequestMethod.GET)
    // public List<User> getAllUsers(@RequestHeader(value ="Authorization") String token) {
    //     if(!validateToken(token)) { return null; }
    //     return userDao.getAllUsers();
    // }
    @RequestMapping(value="api/users")
    public List<User> getAllUsers() {

        return userDao.getAllUsers();
    }
}
