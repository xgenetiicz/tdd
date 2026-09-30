package com.example.testDrivenDevelopment.Hashset;


import com.example.testDrivenDevelopment.Service.HashSetService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashSetTest {

    @Test
    void theHashSetShouldReturnRemovedDuplicatesFromArrayList(){

        HashSetService service =  new HashSetService();

        ArrayList<String> randomList = new ArrayList<>();
        randomList.add("hello");
        randomList.add("sup");
        randomList.add("yes");
        randomList.add("hello");
        randomList.add("sup");
        randomList.add("genetiicz");

        Set<String> expected = Set.of("hello", "sup", "yes", "genetiicz");
        ArrayList<String> newFilteredList = service.RemovetheDuplicatesFromAnList();

        assertEquals(expected,new HashSet<>(newFilteredList)); //newFiltered is the actual one from the service.

    }
}
