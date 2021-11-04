package com.example.exam_oct.service.impl;

import com.example.exam_oct.model.entity.Ship;
import com.example.exam_oct.model.service.ShipServiceModel;
import com.example.exam_oct.repository.ShipRepository;
import com.example.exam_oct.sec.CurrentUser;
import com.example.exam_oct.service.CategoryService;
import com.example.exam_oct.service.ShipService;
import com.example.exam_oct.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipServiceImpl implements ShipService {

    private final ModelMapper modelMapper;
    private final ShipRepository shipRepository;
    private final CurrentUser currentUser;
    private final UserService userService;
    private final CategoryService categoryService;


    public ShipServiceImpl(ModelMapper modelMapper, ShipRepository shipRepository
            , CurrentUser currentUser
            , UserService userService
            , CategoryService categoryService) {

        this.modelMapper = modelMapper;
        this.shipRepository = shipRepository;
        this.currentUser = currentUser;
        this.userService = userService;
        this.categoryService = categoryService;

    }

    @Override
    public void addShip(ShipServiceModel shipServiceModel) {
        Ship ship = modelMapper.map(shipServiceModel, Ship.class);
        ship.setUser(userService.findById(currentUser.getId()));
        ship.setCategory(categoryService.findByCategoryNameEnum(shipServiceModel.getCategory()));

        shipRepository.save(ship);
    }

    @Override
    public List<Ship> findAllShips() {
        return shipRepository.findAll();
    }


}
