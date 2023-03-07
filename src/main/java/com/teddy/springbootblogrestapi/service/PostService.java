package com.teddy.springbootblogrestapi.service;

import com.teddy.springbootblogrestapi.payload.PostDto;
import com.teddy.springbootblogrestapi.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id);

    PostDto updatePost(long id, PostDto postDto);

    void deletePostById(long id);
//
//    List<PostDto> getPostsByCategory(Long categoryId);
}
