package com.jiralite.sprint.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "sprints")
public class Sprints {
    @Id
    private int id;
    private String name;
    private Timestamp start_date;
    private Timestamp end_date;
    private String status;

}
