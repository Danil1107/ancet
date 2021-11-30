package com.example.demo.service;

import com.example.demo.model.AnQsModel;
import com.example.demo.repository.AnQsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnQsService implements AnQsIService {
    @Autowired
    private AnQsRepo anQsRepo;
    @Override
    public void saveanq(AnQsModel anQsModel) {
        anQsRepo.save(anQsModel);
    }

    @Override
    public List<AnQsModel> listall() {
        return anQsRepo.findAll();
    }

    @Override
    public void deleteAnQ(int id) {
this.anQsRepo.deleteById(id);
    }

    @Override
    public AnQsModel get(int id) {
        Optional<AnQsModel> a =anQsRepo.findById(id);
        return a.get();
    }
}
