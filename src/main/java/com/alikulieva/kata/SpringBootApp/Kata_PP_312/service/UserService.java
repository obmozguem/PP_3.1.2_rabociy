package com.alikulieva.kata.SpringBootApp.Kata_PP_312.service;



import com.alikulieva.kata.SpringBootApp.Kata_PP_312.models.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();

    User getUserById(Long id);

    void save(User user);

    void update(User user);

    void delete(Long id);
}
