package com.example.communityservice.service;

import com.example.communityservice.domian.Post;
import com.example.communityservice.dto.PostRequestDto;
import com.example.communityservice.dto.PostResponseDto;
import com.example.communityservice.repository.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<PostResponseDto> getPosts() {
        return postRepository.findAll()
                .stream()
                .map(post -> new PostResponseDto(post.getTitle().getTitle(), post.getCreatedAt(), post.getUpdatedAt(),post.getCategory(), post.getStatus()))
                .toList();
    }


    @Transactional
    public PostResponseDto createPost(PostRequestDto postRequestDto) {
        Post post = postRequestDto.toPost();
        Post savedPost = postRepository.save(post);

        return new PostResponseDto(savedPost);

    }

    @Transactional
    public void updatePost(Long postId, PostRequestDto postUpdateRequestDto) {

        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));

        post.updatePost(postUpdateRequestDto);


    }

    @Transactional
    public void deletePost(Long postId) {
        postRepository.deleteById(postId);
    }
}
