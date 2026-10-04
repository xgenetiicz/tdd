package com.example.testDrivenDevelopment.db;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId; // for now for testing.

    @Column(name = "is_active")
    private Boolean isActive;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }


}
