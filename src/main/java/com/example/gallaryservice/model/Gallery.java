package com.example.gallaryservice.model;

import java.util.List;

public class Gallery {


    private String imageId;

    private List<Images> images;

    public Gallery() {
    }

    public Gallery(String imageId, List<Images> images) {
        this.imageId = imageId;
        this.images = images;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }
}
