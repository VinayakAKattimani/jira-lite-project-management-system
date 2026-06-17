# 🚀 Jira Lite - Project Management System

A scalable **Project Management System** inspired by Jira, built using **Java, Spring Boot, and PostgreSQL**.  
The project is designed with **real-world backend architecture principles** and is being evolved toward a full-stack, microservices-ready system.

---

## 🧠 Objective

Jira Lite aims to replicate core features of a project management tool:

- User management
- Project creation & collaboration
- Issue tracking system (tasks, bugs, stories)
- Sprint management
- Comments & activity tracking

---

## 🏗️ System Architecture

The project follows a layered architecture:
## Planned evolution:


---

## ⚙️ Tech Stack

- Java 21  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- PostgreSQL  
- Maven  
- Flyway (planned for DB migrations)  
- Spring Security (JWT - upcoming)  
- Docker (future scope)  
- Kafka (event-driven design - future scope)  
- AWS (deployment - future scope)

---

## 📦 Core Modules

### 👤 User Management
- User registration (planned)
- Role-based access control (Admin / Manager / User)

### 📁 Project Management
- Create projects
- Assign members
- Track ownership

### 🐞 Issue Tracking
- Create issues (tasks/bugs/stories)
- Assign issues to users
- Status tracking (TODO / IN_PROGRESS / DONE)
- Priority handling

### 🏃 Sprint Management
- Sprint creation
- Sprint-wise issue grouping

### 💬 Collaboration
- Comments on issues
- Activity tracking (future scope)

---

## 🗄️ Database Design (PostgreSQL)

Main tables:

- users  
- projects  
- project_members  
- issues  
- sprints  
- sprint_issues  
- comments  
- attachments  

---

## 📊 High-Level Flow

```

User → Project → Issues → Sprint → Comments
