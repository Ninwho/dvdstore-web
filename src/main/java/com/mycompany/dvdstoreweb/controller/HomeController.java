package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.service.MovieServiceInterface;
import com.mycompany.dvdstoreweb.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface movieService;

    @GetMapping("/dvdstore-home")
    public void displayHome() {
    }

    @GetMapping("/add-movie-form")
    public void displayMovieForm(@ModelAttribute MovieForm movie) {

    }

}
