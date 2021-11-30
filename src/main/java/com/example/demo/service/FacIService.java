package com.example.demo.service;

import com.example.demo.model.AncetsModel;
import com.example.demo.model.FacultyModel;

import java.util.List;

public interface FacIService {
    public void savefac(FacultyModel facultyModel);

    public List<FacultyModel> listall();

    public void deleteFaculty(int id);

    public FacultyModel get(int id);
}
