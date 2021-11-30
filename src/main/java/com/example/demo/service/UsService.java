package com.example.demo.service;

import com.example.demo.model.UsersModel;
import com.example.demo.repository.UsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsService implements UsIService{
    @Autowired
    private UsRepo usRepo;
    @Override
    public void save(UsersModel usersModel) {
        usRepo.save(usersModel);
    }
	@Override
	public List<UsersModel> listall() {
		return usRepo.findAll();
}

    @Override
    public void deleteUser(int id) {
        this.usRepo.deleteById(id);
    }

    @Override
    public UsersModel get(int id) {
        Optional<UsersModel> u = usRepo.findById(id);
        return u.get();
    }
}
