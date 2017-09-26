package com.will.portfoliowb.controllers;

import com.will.portfoliowb.Models.Project;
import com.will.portfoliowb.repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private ProjectRepo projectRepo;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("project", new Project());
        model.addAttribute("myProjects", projectRepo.findAll());
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }


}
