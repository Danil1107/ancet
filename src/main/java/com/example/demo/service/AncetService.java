package com.example.demo.service;

import com.example.demo.model.AncetsModel;
import com.example.demo.model.UsersModel;
import com.example.demo.repository.AncetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AncetService implements AncetIService {
@Autowired
private AncetRepo ancetRepo;
    @Override
    public void saveanc(AncetsModel ancetsModel) {
        ancetRepo.save(ancetsModel);
    }

    @Override
    public List<AncetsModel> listall() {
        return ancetRepo.findAll();
    }

    @Override
    public void deleteAncet(int id) {
        this.ancetRepo.deleteById(id);
    }

    @Override
    public AncetsModel get(int id) {
        Optional<AncetsModel> a = ancetRepo.findById(id);
        return a.get();
    }
}
