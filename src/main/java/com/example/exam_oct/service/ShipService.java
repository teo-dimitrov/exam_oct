package com.example.exam_oct.service;

import com.example.exam_oct.model.entity.Ship;
import com.example.exam_oct.model.service.ShipServiceModel;
import com.example.exam_oct.model.view.ShipViewModel;

import java.util.List;

public interface ShipService {
    void addShip(ShipServiceModel shipServiceModel);


    List<Ship> findAllShips();
}
