package com.jiralite.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "project_members")
public class Project_members {
    private int id;
    private int project_id;
    private String role;




}
