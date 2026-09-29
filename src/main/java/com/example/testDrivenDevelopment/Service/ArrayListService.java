package com.example.testDrivenDevelopment.Service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArrayListService {

    /**
     * Welcome. I feel I should move on to ArrayList now - HashMap feels comfortable and I understand the patterns.
     * Of course, it depends on the problem - but the idea of merging entries, removing, adding(put),
     * and also mutating values with StringBuilder feels good, and I feel confident about it.
     */


    /**
     * task:
     *
     * Create a `Project` class with a name and a boolean for whether it's active.
     * Create a repository interface for it Then write a service method that takes in the repository,
     * fetches all the projects, filters out the ones that aren't active, and returns a list containing just the names of the active ones.
     *Test it with Mockito: mock the repository, make it return a mix of active and inactive projects when
     *`findAll()` is called, and verify your method actually only gives you the names of the active ones.
     *
     */

    public List<String> fetchAllActiveProjects() {
        ArrayList<String> fetchProjects = new ArrayList<>();
        return fetchProjects;
    }
}
