package com.example.demo.repository;

import com.example.demo.model.AncetsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AncetRepo extends JpaRepository<AncetsModel,Integer> {
}
