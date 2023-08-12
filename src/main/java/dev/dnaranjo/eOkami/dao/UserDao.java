package dev.dnaranjo.eOkami.dao;

import java.util.List;
import dev.dnaranjo.eOkami.models.User;

public interface UserDao {
    List<User> getAllUsers();
}
