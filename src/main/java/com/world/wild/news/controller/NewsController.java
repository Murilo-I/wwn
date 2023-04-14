package com.world.wild.news.controller;

import com.world.wild.news.dto.NewsDto;
import com.world.wild.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class NewsController {

    @Autowired
    private NewsService service;

    @GetMapping
    public ResponseEntity<List<NewsDto>> feedNews() {
        return service.loadNews();
    }
}
