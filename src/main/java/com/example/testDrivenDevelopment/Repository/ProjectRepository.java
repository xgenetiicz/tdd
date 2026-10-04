package com.example.testDrivenDevelopment.Repository;

import com.example.testDrivenDevelopment.db.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {

    /**
    Need to make a method so I can use it for test and business logic.
     Create a `Project` class with a name and a boolean for whether it's active.
     */

    boolean isProjectActive();
}
