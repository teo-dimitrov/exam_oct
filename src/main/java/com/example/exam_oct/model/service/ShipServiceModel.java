package com.example.exam_oct.model.service;

import com.example.exam_oct.model.entity.Category;
import com.example.exam_oct.model.entity.CategoryNameEnum;
import com.example.exam_oct.model.entity.User;

import java.time.LocalDate;

public class ShipServiceModel {
    private long id;
    private LocalDate created;
    private long health;
    private String name;
    private long power;
    private CategoryNameEnum category;
    private User user;

    public ShipServiceModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPower() {
        return power;
    }

    public void setPower(long power) {
        this.power = power;
    }

    public CategoryNameEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryNameEnum category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
