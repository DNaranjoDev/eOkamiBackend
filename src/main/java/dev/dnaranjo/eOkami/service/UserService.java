package dev.dnaranjo.eOkami.service;
import dev.dnaranjo.eOkami.models.User;
import dev.dnaranjo.eOkami.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public List<User> allUsers() {
        return userRepo.findAll();
    }
}
