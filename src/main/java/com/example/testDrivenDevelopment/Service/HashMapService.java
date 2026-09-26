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
        changeStringValue.put(1,"Drammen");
        changeStringValue.put(2,"Oslo");
        changeStringValue.put(3,"Tirana");

        changeStringValue.remove(2); // we remove the key
        changeStringValue.put(2, String.valueOf(builder.append("Trondheim"))); //add the new key with put and append it with a string value of "Trondheim"

        //Im getting 2=OsloTrondheim -> so the value is appended - but the old value is not removed. So i need to remove the value before i append the new one.
        /// FINALLY PASSED IT!!!!!! omg this is huge and a crazy way of learning and understanding the data.

        changeStringValue.put(2, builder.toString());

        return changeStringValue; // this should return the value with Trondheim instead Oslo.
    }

    /***
    Okay -  now the goal is to make so many test that i never fail anymore on the easy stuff.
     */

    public Map<Long,Integer> removeAndPutNewInteger() {
        HashMap<Long,Integer> checkingInteger = new HashMap<>();

        checkingInteger.put(123L,1);
        checkingInteger.put(235L,2);
        checkingInteger.put(345L,3);
        checkingInteger.put(567L,4);

       // checkingInteger.get(567L);

        checkingInteger.remove(567L); // i remove the key
        checkingInteger.put(891L,10); //put the new key back

        return checkingInteger;

        /// This is too fun. I will never stop doing this - it feel like doing math and just getting rewarded each time I solve it.
    }
}
