package com.example.exam_oct.repository;

import com.example.exam_oct.model.entity.Category;
import com.example.exam_oct.model.entity.CategoryNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByName(CategoryNameEnum name
    );
}
