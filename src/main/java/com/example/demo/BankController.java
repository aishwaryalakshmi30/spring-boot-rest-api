package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BankController {

    @Autowired
    BankService bankService;

    // GET - All Users
    @GetMapping("/users")
    public List<User> getUsers() {
        return bankService.getUsers();
    }

    // GET - User by ID
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        for (User user : BankService.list) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    // POST - Add User
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        BankService.list.add(user);
        return user;
    }

    // PUT - Update User
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        for (User user : BankService.list) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return user;
            }
        }
        return null;
    }

    // DELETE - Delete User
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        boolean removed = BankService.list.removeIf(user -> user.getId() == id);

        if (removed) {
            return "User deleted successfully";
        }

        return "User not found";
    }
}