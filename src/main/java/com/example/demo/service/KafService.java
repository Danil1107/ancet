package com.example.demo.service;

import com.example.demo.model.KafedraModel;
import com.example.demo.repository.KafedrasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class KafService implements KafIService {
    @Autowired
    private KafedrasRepo kafedrasRepo;

    @Override
    public void savekaf(KafedraModel kafedraModel) {
        kafedrasRepo.save(kafedraModel);
    }

    @Override
    public List<KafedraModel> listall() {
        return kafedrasRepo.findAll();
    }

    @Override
    public void deleteKafedra(int id) {
        this.kafedrasRepo.deleteById(id);
    }

    @Override
    public KafedraModel get(int id) {
        Optional<KafedraModel>k=kafedrasRepo.findById(id);
        return k.get();
    }
}
