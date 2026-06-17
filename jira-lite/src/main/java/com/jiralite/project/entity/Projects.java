package com.jiralite.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import org.hibernate.Hibernate;

@Entity
@Table(name = "projects")
public class Projects {
    @Id
    private long id;
    private String name;
    private String text;
    @JoinColumn()
    private int owner_id;



}
