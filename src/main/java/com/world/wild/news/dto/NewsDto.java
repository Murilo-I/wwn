package com.world.wild.news.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class NewsDto {

    private String author;
    private String title;
    private String desc;
    private String coverPath;
}
