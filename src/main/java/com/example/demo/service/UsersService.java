package com.example.demo.service;

import com.example.demo.model.UsersModel;
import com.example.demo.repository.UsersRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    public UsersModel authenticate(String login,String pass){
        return usersRepository.findByLoginAndPass(login,pass).orElse(null);
    }
}
