package com.example.demo.service;

import com.example.demo.model.UsersModel;

import java.util.List;

public interface UsIService {
    public void save(UsersModel usersModel);

    public List<UsersModel> listall();

    public void deleteUser(int id);

    public UsersModel get(int id);
}
