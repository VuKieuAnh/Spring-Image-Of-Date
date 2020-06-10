package com.codegym.service;

import com.codegym.exception.BadWordException;
import com.codegym.model.Comment;

public interface CommentService {
    Iterable<Comment> findAll();

    Comment findById(Long id);

    void saveComment(Comment comment);

    void deleteComment(Long id);

    Iterable<Comment> allTodayComments();

    void like(Comment comment);

    void disLike(Comment comment);

    void checkBadWord(Comment comment) throws BadWordException;
}
