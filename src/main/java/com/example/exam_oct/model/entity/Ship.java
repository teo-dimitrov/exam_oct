package com.example.exam_oct.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name = "ships")
public class Ship extends BaseEntity{

    private LocalDate created;
    private long health;
    private String name;
    private long power;
    private Category category;
    private User user;

    public Ship() {
    }

    @Column(nullable = false)
    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
    @Column(nullable = false)
    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    @Column(nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    public long getPower() {
        return power;
    }

    public void setPower(long power) {
        this.power = power;
    }

    @ManyToOne
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
