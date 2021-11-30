package com.example.demo.repository;

import com.example.demo.model.PrepodModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrepodRepo extends JpaRepository<PrepodModel, Integer> {
}
