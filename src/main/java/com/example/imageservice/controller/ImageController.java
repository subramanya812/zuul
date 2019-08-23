package com.example.imageservice.controller;

import com.example.imageservice.model.Images;
import com.example.imageservice.payload.ImageRequest;
import com.example.imageservice.services.ImageServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ImageController {

    @Autowired
    ImageServicesImpl imageServicesimpl;

    @Autowired
    Environment environment;


    @GetMapping("/")
    public String home(){
        return "Home from Image service running port: " + environment.getProperty("local.server.port");

    }

    @PostMapping("/addImages")
    public Images addImages(@RequestBody ImageRequest imageRequest){

        if(imageRequest == null){
            System.out.println("null values");
        }

        return imageServicesimpl.addImages(imageRequest);
    }

    @GetMapping("/getImages")
    public List<Images> getImagesList(){
        return imageServicesimpl.getImages();
    }

}
