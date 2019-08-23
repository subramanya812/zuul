package com.example.gallaryservice.controller;


import com.example.gallaryservice.model.Gallery;
import com.example.gallaryservice.model.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class GalleryController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    Environment environment;


    @GetMapping("/")
    public String home(){
        return "Hello from Gallery service runnning port: " + environment.getProperty("local.server.port");
    }

    @GetMapping("/{imageId}")
    public Gallery getGallery(@PathVariable final String imageId) {
        // create gallery object
        Gallery gallery = new Gallery();
        gallery.setImageId(imageId);

        // get list of available images
        List<Images> images = restTemplate.getForObject("http://image-service/images/", List.class);
        gallery.setImages(images);

        return gallery;
    }

    // -------- Admin Area --------
    // This method should only be accessed by users with role of 'admin'
    // We'll add the logic of role based auth later
    @GetMapping("/admin")
    public String homeAdmin() {
        return "This is the admin area of Gallery service running at port: " + environment.getProperty("local.server.port");
    }


}
