package com.example.DBTest.controller;

import com.example.DBTest.Model.User.User;
import com.example.DBTest.Model.User.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/get-all") // 나중에 android에서 요청할 때
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    // android에서 새로운 정보를 입력받는다면
    @PostMapping("/user/save")
    public User save(@RequestBody User user){
        return userDao.save(user);

    }
}
