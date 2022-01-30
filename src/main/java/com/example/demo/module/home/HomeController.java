package com.example.demo.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping({"/", "/home", "/index.html"}) //jakaś nazwa w url
    public String getHome(Model model) {
        //strings
        model.addAttribute("name","Mariusz");
        model.addAttribute("surname","Tarnowski");

        //objects
        model.addAttribute("person", new PersonDto("Marta", "Trenda", 22));

        // list
        List<Object> persons = new ArrayList<>();
        persons.add(new PersonDto("Mariusz", "Tarnowski", 45));
        persons.add(new PersonDto("Michał", "Szałkowski", 25));
        persons.add(new PersonDto("Alicja", "Bajer", 22));
        model.addAttribute("persons",persons);

        return "home/index.html";
    }

}
