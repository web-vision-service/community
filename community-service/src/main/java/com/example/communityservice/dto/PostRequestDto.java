package com.example.communityservice.dto;

import com.example.communityservice.domian.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class PostRequestDto {

    private String title;

    private String content;

    private Status status;

    private Category category;



    public Post toPost(){
        return Post.builder()
                .title(new Title(this.getTitle()))
                .content(new Content(this.getContent()))
                .status(this.getStatus())
                .category(this.getCategory())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

    }

    public void updatePost(){
        Post.builder()
                .title(new Title(this.getTitle()))
                .content(new Content(this.getContent()))
                .status(this.getStatus())
                .category(this.getCategory())
                .updatedAt(LocalDateTime.now())
                .build();
    }



}
