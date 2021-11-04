package com.example.exam_oct.model.binding;

import com.example.exam_oct.model.entity.Category;
import com.example.exam_oct.model.entity.CategoryNameEnum;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class ShipAddBindingModel {
    private LocalDate created;
    private long health;
    private String name;
    private long power;
    private CategoryNameEnum category;

    public ShipAddBindingModel() {
    }

    @NotNull
    @PastOrPresent(message = "Created date can not be in the future!")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    @NotNull
    @Positive
    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    @NotNull
    @Size(min = 2, max = 10, message = "Name must between 2 and 10 characters")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @Positive
    public long getPower() {
        return power;
    }

    public void setPower(long power) {
        this.power = power;
    }

    @NotNull(message = "You must select the category.")
    public CategoryNameEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryNameEnum category) {
        this.category = category;
    }
}
