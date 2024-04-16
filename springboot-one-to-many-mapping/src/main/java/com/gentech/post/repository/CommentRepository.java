package com.gentech.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.post.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
