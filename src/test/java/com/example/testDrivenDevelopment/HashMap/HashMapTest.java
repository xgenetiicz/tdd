package com.example.testDrivenDevelopment.HashMap;


import com.example.testDrivenDevelopment.Service.HashMapService;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashMapTest {

    @Test
    void thisTestShouldOnlyAppendOneStringInHashMapBasedOnInteger() {
        //Now we test the service.
        //Create the object of the class of course with reference to firstTest
        HashMapService firstTest = new HashMapService();

        //now I think it was that we use AssertEqual - because I want to see that the object is equal to "Trondheim".

        //Nice - now we got the expected shown in the IDE.


        assertEquals("Trondheim",firstTest.tryToChangeWithBuilderTest().get(2)); ///so always assertEquals(expected,the method().get(key));
    }

    @Test
    void removeKeyOfLongAndPutNewValueOfInteger(){
        HashMapService secondTest = new HashMapService();

        assertEquals(10, secondTest.removeAndPutNewInteger().get(891L));

        //good.
    }

    @Test
    void changeValueOfKeyAndTheActualValue(){
        HashMapService thirdTest = new HashMapService();

        //build the expected map

        Map<String,String> expectedMap =  new HashMap<>();
        expectedMap.put("genti.rudi47@gmail.com", "genetiicz");
        expectedMap.put("gentispill@gmail.com", "serious");
        expectedMap.put("gentitest@gmail.com", "du");
        expectedMap.put("gentiagron123@gmail.com", "newValue");

        //and now i call on the actualMap and verify this.

        Map<String,String> actualMap = thirdTest.findOutEmailAndUsername();

        assertEquals(expectedMap,actualMap,"the map returned the exact values and the newValue also"); ///FINALLY! WHEN I WANT TO CHECK THE WHOLE EXPECTED MAP -> THE
        /// RESULT SHOULD BE assertedEquals as the expected map for the test, and then the acutal map from the service i made. and the map is verified and complete!

    }

    @Test
    void countHowManyEachWordAppearsInTheArray() {

        HashMapService fourthTest = new HashMapService();

        //Map<String,Integer> expectedMap = new HashMap<>(); //there is no expected map here.

        //Lay out the words for testing
        String[] words = {"apple","banana","banana", "kiwi","apple","orange","apple"}; //so i have set three apples here,

        Map<String,Integer> actualMap = fourthTest.countWords(words); /// So each word got one count, and apple got three counts. "apple" is the key -> and the value of it in total is 3.

        assertEquals(2, actualMap.get("banana"));
        assertEquals(3, actualMap.get("apple"));
        assertEquals(1, actualMap.get("kiwi"));
        assertEquals(1, actualMap.get("orange"));
        assertEquals(4, actualMap.size());
    }
}
