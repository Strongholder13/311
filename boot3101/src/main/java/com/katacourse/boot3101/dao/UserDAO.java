package com.katacourse.boot3101.dao;



import com.katacourse.boot3101.model.User;

import java.util.List;

public interface UserDAO {
    void add(User user);
    void save(User user);

     List<User> listUsers();
     User getUser(int id);

    void deleteUser(int id);
}
