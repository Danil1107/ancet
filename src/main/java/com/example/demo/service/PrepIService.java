package com.example.demo.service;

import com.example.demo.model.KafedraModel;
import com.example.demo.model.PrepodModel;

import java.util.List;

public interface PrepIService {
    public void saveprep(PrepodModel prepodModel);

    public List<PrepodModel> listall();

    public void deletePrep(int id);

    public PrepodModel get(int id);
}
