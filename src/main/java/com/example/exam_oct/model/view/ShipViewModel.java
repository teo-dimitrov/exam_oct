package com.example.exam_oct.model.view;

import com.example.exam_oct.model.entity.Category;
import com.example.exam_oct.model.entity.CategoryNameEnum;
import com.example.exam_oct.model.entity.User;

import java.time.LocalDate;

public class ShipViewModel {

    private Long id;
    private long health;
    private String name;
    private long power;
    private LocalDate created;
    private Category category;
    private User user;

    public ShipViewModel() {
    }

    public Long getId() {
        return id;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
