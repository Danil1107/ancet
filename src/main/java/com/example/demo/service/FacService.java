package com.example.demo.service;

import com.example.demo.model.AncetsModel;
import com.example.demo.model.FacultyModel;
import com.example.demo.repository.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacService implements FacIService{
    @Autowired
    private FacultyRepo facultyRepo;

    @Override
    public void savefac(FacultyModel facultyModel) {
        facultyRepo.save(facultyModel);
    }

    @Override
    public List<FacultyModel> listall() {
        return facultyRepo.findAll();
    }

    @Override
    public void deleteFaculty(int id) {
        this.facultyRepo.deleteById(id);
    }

    @Override
    public FacultyModel get(int id) {
        Optional<FacultyModel> f =facultyRepo.findById(id);
        return f.get();
    }
}
