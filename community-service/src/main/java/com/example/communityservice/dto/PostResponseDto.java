package com.example.communityservice.dto;

import com.example.communityservice.domian.Category;
import com.example.communityservice.domian.Post;
import com.example.communityservice.domian.Status;
import lombok.Data;

@Data
public class PostResponseDto {

    private String title;

    private String content;

    private Status status;

    private Category category;


    public PostResponseDto(String title,  Category category, Status status) {

        this.title = title;

        this.category = category;

        this.status = status;
    }


    public PostResponseDto(Post post) {
        this.title = post.getTitle().getTitle();

        this.content = post.getContent().getContent();

        this.category = post.getCategory();

        this.status = post.getStatus();
    }

}
