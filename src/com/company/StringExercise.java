package com.company;

import com.sun.javafx.collections.MappingChange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringExercise {
    private String builder;


    public void concateMethod(String str1, String str2) {
        this.builder = str1 + " " + str2;
    }

    public String getBuilder() {
        return builder;
    }


    public static String stringBuffer() {
        String myString = "";

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("Please put in a sentence");
            myString = console.readLine();

        } catch (Exception e) {
            System.out.println(e);
        } finally

        {
            try {
                console.close();
            } catch (Exception e) {

            }
            console = null;
        }
        return myString;

    }

    public static void crawlingFriday(String myString) {
        char[] myChar = myString.toCharArray();
        String str7 = "";
        for (int i = 0; i < myChar.length; i++) {
            str7 += myChar[i];
            System.out.println(str7.toUpperCase());
        }

    }

    public static void reverseString(String revString) {
        String myString = "";
        char[] myChar = revString.toCharArray();
        for (int i = myChar.length - 1; i >= 0; i--) {
            myString += myChar[i];
        }
        System.out.println(myString);
    }

    public static void leetSpeak(String myString) {
        String inString = myString.toUpperCase();
        inString = inString.replace('A', '4');

        inString = inString.replace('E', '3');
        inString = inString.replace('G', '6');
        inString = inString.replace('I', '1');
        inString = inString.replace('O', '0');
        inString = inString.replace('S', '5');
        inString = inString.replace('T', '7');
        System.out.println(inString);

    }

    public static void foundStudents(String[] fullStudentList, String[] inputList) {
        for (String input : inputList) {
            String ans = null;
            int count = 0;

            for (String fromFull : fullStudentList) {
                if (fromFull.equals(input)) {
                    ans = "Found " + input + "at index: " + count;
                    break;
                }
                count++;
            }

            if (ans != null) {
                System.out.println(ans);
            } else {
                System.out.println("Not Found");
            }


        }
    }

    public static void letterSummary(String mystring) {

        char[] myCharAr = mystring.toCharArray();
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();

        for (Character c : myCharAr) {
            if (myMap.containsKey(c)) {
                int more = myMap.get(c);
                more++;
                myMap.put(c, more);
            } else {
                myMap.put(c, 1);
            }

        }

        for(Map.Entry<Character,Integer> m : myMap.entrySet()){
            System.out.println(m.getKey() +" = "+ m.getValue());


        }

    }
}

