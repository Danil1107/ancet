package com.example.demo.service;

import com.example.demo.model.AncetsModel;
import com.example.demo.model.UsersModel;

import java.util.List;

public interface AncetIService {
    public void saveanc(AncetsModel ancetsModel);

    public List<AncetsModel> listall();

    public void deleteAncet(int id);

    public AncetsModel get(int id);
}
