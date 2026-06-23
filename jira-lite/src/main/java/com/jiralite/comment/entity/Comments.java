package com.jiralite.comment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class Comments {
    @Id
    private int id;
    private String text;
    private int issue_id;
    private int user_id;
}
