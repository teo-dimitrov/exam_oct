package com.example.exam_oct.repository;

import com.example.exam_oct.model.entity.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipRepository extends JpaRepository<Ship, Long> {

}
