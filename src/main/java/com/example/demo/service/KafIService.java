package com.example.demo.service;

import com.example.demo.model.FacultyModel;
import com.example.demo.model.KafedraModel;

import java.util.List;

public interface KafIService {
    public void savekaf(KafedraModel kafedraModel);

    public List<KafedraModel> listall();

    public void deleteKafedra(int id);

    public KafedraModel get(int id);
}
