package com.example.demo.repository;

import com.example.demo.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsRepo extends JpaRepository<UsersModel, Integer> {
}
