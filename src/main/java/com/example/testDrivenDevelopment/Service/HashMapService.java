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

    //The idea is to have key value pair for hashmap, a scenario where i store the email that is key with the usernames
    public Map<String,String> findOutEmailAndUsername() {
        HashMap <String, String> emailAndUserName = new HashMap<>();

        emailAndUserName.put("genti.rudi47@gmail.com", "genetiicz");
        emailAndUserName.put("genti@gmail.com", "alo");
        emailAndUserName.put("gentispill@gmail.com", "serious");
        emailAndUserName.put("gentitest@gmail.com", "du");

        emailAndUserName.remove("genti@gmail.com");
        emailAndUserName.put("gentiagron123@gmail.com", "newValue");

        if(emailAndUserName.containsValue("newValue")) {

           String key = emailAndUserName.get("gentiagron123@gmail.com");

            System.out.println("The key of this value is: " + key);
        }

        for (String i : emailAndUserName.keySet()){
            System.out.println("email: " + i + " value: " +  emailAndUserName.get(i)); //this should return the HashMap and the new emailAndUserName
        }

        return emailAndUserName;
    }

    //Last test of HashMap
    /**
    *Write a method for words in a array that count how many times it appears.
     */

    public Map<String, Integer> countWords(String[] words){
        HashMap <String,Integer> wordsAppear = new HashMap<>();
        for (String appearance : words){
            if (appearance == null){
                continue;
            }

            wordsAppear.merge(appearance,1,Integer::sum); // so for EACH KEY that appear, if the key is the same we sum the value of the key by one on each iteration.

            //if an apple shows up three times.
            //apple = 1
            //apple = 1+1 =2
            //apple =2+1 =3.

            System.out.println("word: " + appearance + " came up: " + wordsAppear.get(appearance));
        }

        return wordsAppear;
    }
}
