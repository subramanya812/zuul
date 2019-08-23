package com.example.imageservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "images")
public class Images {
    @Id
    private String imageId;

    private String imageName;

    private String imageLink;

    public Images() {
    }

    public Images(String imageId, String imageName, String imageLink) {
        this.imageId = imageId;
        this.imageName = imageName;
        this.imageLink = imageLink;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
