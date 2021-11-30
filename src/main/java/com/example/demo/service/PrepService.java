package com.example.demo.service;

import com.example.demo.model.KafedraModel;
import com.example.demo.model.PrepodModel;
import com.example.demo.repository.PrepodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrepService implements PrepIService {
    @Autowired
    private PrepodRepo prepodRepo;
    @Override
    public void saveprep(PrepodModel prepodModel) {
        prepodRepo.save(prepodModel);
    }

    @Override
    public List<PrepodModel> listall() {
        return prepodRepo.findAll();
    }

    @Override
    public void deletePrep(int id) {
this.prepodRepo.deleteById(id);
    }

    @Override
    public PrepodModel get(int id) {
        Optional<PrepodModel> p=prepodRepo.findById(id);
        return p.get();
    }
}
