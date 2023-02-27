package com.academy.service;

import com.academy.model.entity.User;

import java.util.Arrays;
import java.util.List;

public class UserService {
    private List<User> users;

    public UserService() {
        users = Arrays.asList(
                new User("Vova", "111"),
                new User("Olya", "222"),
                new User("Sara", "333")

        );
    }

    public boolean checkCredentials(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
