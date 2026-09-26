package com.example.testDrivenDevelopment.HashMap;


import com.example.testDrivenDevelopment.Service.HashMapService;
import org.junit.jupiter.api.Test;

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

}
