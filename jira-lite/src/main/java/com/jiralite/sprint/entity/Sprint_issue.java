package com.jiralite.sprint.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "sprint_issue")
public class Sprint_issue {
    @Id
    private int sprint_id;
    private int issue_id;

}
