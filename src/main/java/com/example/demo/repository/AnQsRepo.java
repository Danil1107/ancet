package com.example.demo.repository;

import com.example.demo.model.AnQsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnQsRepo extends JpaRepository<AnQsModel, Integer> {
}
