package com.narenkg.GCPHelloWorld.repo;

import java.util.List;

import com.narenkg.GCPHelloWorld.model.User;

public interface UserRepository {

    public User findById(Long id);

    public List<User> findAll();

    public int insert(User user);

    public int update(User user);

    public int deleteById(Long id);
}
