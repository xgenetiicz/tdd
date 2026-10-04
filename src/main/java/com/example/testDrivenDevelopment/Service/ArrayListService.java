package com.example.testDrivenDevelopment.Service;


import com.example.testDrivenDevelopment.Repository.ProjectRepository;
import com.example.testDrivenDevelopment.db.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArrayListService {

    private ProjectRepository projectRepository;


    //Constructor
    public ArrayListService(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    /**
     * Welcome. I feel I should move on to ArrayList now - HashMap feels comfortable and I understand the patterns.
     * Of course, it depends on the problem - but the idea of merging entries, removing, adding(put),
     * and also mutating values with StringBuilder feels good, and I feel confident about it.
     */


    /**
     * task:
     *
     * Create a `Project` class with a name and a boolean for whether it's active. || done
     * Create a repository interface for it Then write a service method that takes in the repository, || done.
     * fetches all the projects, filters out the ones that aren't active, and returns a list containing just the names of the active ones.
     *Test it with Mockito: mock the repository, make it return a mix of active and inactive projects when
     *`findAll()` is called, and verify your method actually only gives you the names of the active ones.
     *
     */

    public List<String> fetchAllActiveProjects() {

        List <Project> findAllProjects = projectRepository.findAll(); // we retrieve a list from the hibernate
        //Create an array that can be scaled if several - not a fixed one.
        ArrayList<String> projectsInArrayList = new ArrayList<>();

        //try to write some defensive programming and return the list here instead if the object is currently null
        //when retrieving the lists
        if(findAllProjects.isEmpty()){
            throw new NullPointerException("There are no projects available currently"); // i will throw a nullpointer now but next time i would have created a global exceptions handler and a custom exception
            /// such as ResourceNotFound instead.
        }

        //after i find all projects - I want the projects to be stored into an ArrayList but also been checked if they are active.
        for(Project projects : findAllProjects){ //for each findAllProject we store this into project
            if(projects.getIsActive()){
                projectsInArrayList.add(String.valueOf(projects.getProjectId())); /// here do i add all the projects found into the arrayList so i can return this later. I have it with a projectId, but could have the name of it for example
            } else if(!projects.getIsActive()) {
                System.out.println("Project and the project id of: " + projects.getProjectId() + " is not Active");
            }
        }
        return projectsInArrayList;
    }
}
