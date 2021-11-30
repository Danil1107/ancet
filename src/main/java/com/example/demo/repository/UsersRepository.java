package com.example.demo.repository;

import com.example.demo.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel,Integer> {
    Optional<UsersModel> findByLoginAndPass(String login,String pass);
}
