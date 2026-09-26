package com.example.testDrivenDevelopment.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HashMapService {

    /**
     * So i can put,remove,get,clear (clear all items),size(checking how many items)
     * with a HashMap. This test will just be a easy test with appending and changing one key's
     * string to another value. First with without a loop - then next time with one for enhanced loop.
     *
     * All of these methods, will be written and tested with JUnit 5, and later on with Mockito.
     * I think this is the best approach to actually understand the datastructures, and how to implement
     * on different scenarios.
     */


    public Map<Integer,String> tryToChangeWithBuilderTest(){
        //first a need to define the Map with a reference object.


        Map<Integer,String> changeStringValue = new HashMap<>(); //Create a object of Interface Map
        //Now the StringBuilder
        StringBuilder builder = new StringBuilder();

        return changeStringValue;
    }
}
