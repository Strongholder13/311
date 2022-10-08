package com.katacourse.boot3101.dao;

import com.katacourse.boot3101.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void save(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> listUsers() {
        List<User> list = entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
        return list;
    }

    @Override
    public User getUser(int id) {
        User user = entityManager.find(User.class, id);
        return user;
    }

    public void deleteUser(int id) {
        User user = this.entityManager.find(User.class, id);
        this.entityManager.remove(user);
    }
}

