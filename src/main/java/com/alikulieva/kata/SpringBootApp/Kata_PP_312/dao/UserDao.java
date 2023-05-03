package com.alikulieva.kata.SpringBootApp.Kata_PP_312.dao;



import com.alikulieva.kata.SpringBootApp.Kata_PP_312.models.User;

import java.util.List;

public interface UserDao {
    List<User> showAllUsers();

    User getUserById(Long id);

    void save(User user);

    void update(User user);

    void delete(Long id);

}
