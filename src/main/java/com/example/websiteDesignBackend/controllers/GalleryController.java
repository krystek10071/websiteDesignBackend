package com.example.websiteDesignBackend.controllers;

import com.example.websiteDesignBackend.models.GalleryEntity;
import com.example.websiteDesignBackend.services.GalleryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class GalleryController {

    private final GalleryService galleryService;

    @GetMapping("/articles")
    public List<GalleryEntity> getArticles(@RequestParam int page ){
        return galleryService.getArticles(page);
    }
}
