package com.example.demo.service;

import com.example.demo.model.AnQsModel;
import com.example.demo.model.FacultyModel;

import java.util.List;

public interface AnQsIService {
    public void saveanq(AnQsModel anQsModel);

    public List<AnQsModel> listall();

    public void deleteAnQ(int id);

    public AnQsModel get(int id);
}
