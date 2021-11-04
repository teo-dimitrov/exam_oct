package com.example.exam_oct.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Categories")
public class Category extends BaseEntity{

    private CategoryNameEnum name;
    private String description;

    public Category() {
    }

    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    public CategoryNameEnum getName() {
        return name;
    }

    public void setName(CategoryNameEnum name) {
        this.name = name;
    }

    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
