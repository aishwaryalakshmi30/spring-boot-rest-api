package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankService {

    static List<User> list = new ArrayList<>();

    public BankService() {
        list.add(new User(1, "Aishwarya", "aishwarya@gmail.com"));
        list.add(new User(2, "Keerthi", "keerthi@gmail.com"));
    }

    public List<User> getUsers() {
        return list;
    }
}