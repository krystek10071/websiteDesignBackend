package com.example.websiteDesignBackend.models.repository;

import com.example.websiteDesignBackend.models.GalleryEntity;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GalleryRepository extends JpaRepository<GalleryEntity, Long> {

    @Query("Select a From GalleryEntity a")
    List<GalleryEntity> findAllArticles(PageRequest page);
}
