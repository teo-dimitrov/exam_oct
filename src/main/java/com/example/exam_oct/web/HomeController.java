package com.example.exam_oct.web;

import com.example.exam_oct.model.view.ShipViewModel;
import com.example.exam_oct.sec.CurrentUser;
import com.example.exam_oct.service.ShipService;
import com.example.exam_oct.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class HomeController {

    private final CurrentUser currentUser;
    private final ShipService shipService;
    private final UserService userService;


    public HomeController(CurrentUser currentUser
            , ShipService shipService
            , UserService userService) {

        this.currentUser = currentUser;
        this.shipService = shipService;
        this.userService = userService;

    }

    @GetMapping("/")
    public String index(Model model) {
        if (currentUser.getId() == null) {
            return "index";
        }

        model.addAttribute("users", userService.findAllUsers());
        model.addAttribute("ships", shipService.findAllShips());
        return "home";
    }


}
