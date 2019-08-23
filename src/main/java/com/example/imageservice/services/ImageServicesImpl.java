package com.example.imageservice.services;


import com.example.imageservice.model.Images;
import com.example.imageservice.payload.ImageRequest;
import com.example.imageservice.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ImageServicesImpl {

    @Autowired
    private ImageRepository imageRepository;


    public Images addImages(ImageRequest imageRequest){

        Images images=new Images();
        images.setImageId(imageRequest.getImageId());
        images.setImageName(imageRequest.getImageName());
        images.setImageLink(imageRequest.getImageLink());
        imageRepository.save(images);
        return images;
    }

    public List<Images> getImages(){
        List<Images> images=imageRepository.findAll();
        return images;
    }
}
