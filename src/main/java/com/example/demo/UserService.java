package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.User;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(1, "Aishu", "aishu@gmail.com"));
        users.add(new User(2, "Rahul", "rahul@gmail.com"));
    }

    // GET
    public User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    // POST
    public User addUser(User user) {
        users.add(user);
        return user;
    }

    // PUT
    public User updateUser(int id, User newUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                newUser.setId(id);
                users.set(i, newUser);
                return newUser;
            }
        }
        return null;
    }

    // DELETE
    public String deleteUser(int id) {
        boolean removed = users.removeIf(user -> user.getId() == id);

        if (removed) {
            return "User deleted successfully";
        }

        return "User not found";
    }
}