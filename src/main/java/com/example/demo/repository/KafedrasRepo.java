package com.example.demo.repository;

import com.example.demo.model.KafedraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafedrasRepo extends JpaRepository<KafedraModel, Integer> {
}
