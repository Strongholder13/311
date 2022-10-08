package com.katacourse.boot3101.service;




import com.katacourse.boot3101.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void update(User user);

    List<User> listUsers();

    User findById(int id);

    void delete(int id);

}