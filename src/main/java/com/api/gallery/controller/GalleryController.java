package com.api.gallery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController //Controller + Response body
public class GalleryController {
    //get HTTP Method (localhost:8080/hello)
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

    //post


    //put

    //delete

    //fetch
}
