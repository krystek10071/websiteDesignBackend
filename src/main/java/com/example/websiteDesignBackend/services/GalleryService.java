package com.example.websiteDesignBackend.services;

import com.example.websiteDesignBackend.models.GalleryEntity;
import com.example.websiteDesignBackend.models.repository.GalleryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GalleryService {

    private static final int page_SIZE = 3;
    private final GalleryRepository galleryRepository;


    public List<GalleryEntity> getArticles(int page){
        return galleryRepository.findAllArticles(PageRequest.of(page, page_SIZE));
    }

}
