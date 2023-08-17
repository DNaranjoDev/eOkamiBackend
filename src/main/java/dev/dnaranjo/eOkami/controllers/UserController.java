package dev.dnaranjo.eOkami.controllers;
import dev.dnaranjo.eOkami.models.User;
import dev.dnaranjo.eOkami.repository.UserRepository;
import dev.dnaranjo.eOkami.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private UserService userService;

    @GetMapping("api/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<List<User>>(userService.allUsers(), HttpStatus.OK);
    }
    @PostMapping("api/addUser")
    public void addUser(@RequestBody User user) {
        userRepo.save(user);
    }
}
