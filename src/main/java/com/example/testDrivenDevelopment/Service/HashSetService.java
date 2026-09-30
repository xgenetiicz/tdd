package com.example.testDrivenDevelopment.Service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Service
public class HashSetService {

    public ArrayList<String> RemovetheDuplicatesFromAnList() {

        ArrayList<String> randomList = new ArrayList<>();
        randomList.add("hello");
        randomList.add("sup");
        randomList.add("yes");
        randomList.add("hello");
        randomList.add("sup");
        randomList.add("genetiicz");

        Set<String> removeDuplicates = new HashSet<>(randomList); //so here do we put the the arraylist object.

        if (removeDuplicates.isEmpty()) {
            System.out.println("There is no elements in the ArrayList: randomList");
        } else {
            System.out.println("The list has bleen cleaned");
        }
        ArrayList<String> newFilteredList = new ArrayList<>(removeDuplicates); // we want to store the removedDuplicates into a new ArrayList

        return newFilteredList;  //So this should return [hello,sup,yes,genetiicz] -> unordered.
    }
}
