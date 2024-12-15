package com.example.communityservice.dto;

import com.example.communityservice.domian.Category;
import com.example.communityservice.domian.Post;
import com.example.communityservice.domian.Status;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PostResponseDto {

    private String title;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String content;

    private Status status;

    private Category category;


    public PostResponseDto(String title, LocalDateTime createdAt, LocalDateTime updatedAt, Category category, Status status) {

        this.title = title;

        this.createdAt = createdAt;

        this.updatedAt = updatedAt;

        this.category = category;

        this.status = status;
    }


    public PostResponseDto(Post post) {
        this.title = post.getTitle().getTitle();

        this.content = post.getContent().getContent();

        this.createdAt = post.getCreatedAt();

        this.updatedAt = post.getUpdatedAt();

        this.category = post.getCategory();

        this.status = post.getStatus();
    }

}
