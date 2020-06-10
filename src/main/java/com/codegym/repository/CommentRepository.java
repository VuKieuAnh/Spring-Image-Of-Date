package com.codegym.repository;

import com.codegym.model.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {
//    Iterable<Comment> findAllByProvince(Comment comment);
//
//    Page<Comment> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
