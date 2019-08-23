package com.example.imageservice.repository;

import com.example.imageservice.model.Images;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface ImageRepository extends MongoRepository<Images, String> {
}
