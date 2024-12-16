package com.example.communityservice.controller;

import com.example.communityservice.dto.PostRequestDto;
import com.example.communityservice.dto.PostResponseDto;
import com.example.communityservice.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }

    @GetMapping
    public ResponseEntity<List<PostResponseDto>> getPosts(){
        return ResponseEntity.ok(postService.getPosts());

    }

    @PostMapping
    public ResponseEntity<PostResponseDto> createPost(@RequestBody PostRequestDto postCreateRequestDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(postService.createPost(postCreateRequestDto));

    }

    @PutMapping("/{postId}")
    public ResponseEntity<Void> updatePost(@PathVariable Long postId, @RequestBody PostRequestDto postUpdateRequestDto){

        postService.updatePost(postId, postUpdateRequestDto);

        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<Void> deletePost(@PathVariable Long postId){
        postService.deletePost(postId);
        return ResponseEntity.noContent().build();
    }


}
