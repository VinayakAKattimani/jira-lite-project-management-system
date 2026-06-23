package com.jiralite.issue.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "issue")
public class Issue {
    @Id
    private int id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private int project_id;


}
