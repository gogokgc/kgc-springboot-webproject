package com.kgc.webprj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgc.webprj.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
