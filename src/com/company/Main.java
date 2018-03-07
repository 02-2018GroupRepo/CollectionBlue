package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        letterS("banana");
    }

    static void concatString() {
        StringExercise thisBuilding = new StringExercise();

        String str1 = "Java";
        String str2 = "Programming";

        thisBuilding.concateMethod(str1, str2);
        System.out.println(thisBuilding.getBuilder());
        System.out.println(thisBuilding.getBuilder().length());
        System.out.println(thisBuilding.getBuilder().toLowerCase());
        System.out.println(thisBuilding.getBuilder().toUpperCase());

    }

    static void findMeFunction() {
        String[] students = {"Dina", "Shane", "NaDario", "Amber", "Calder", "Noelle", "Donell"};
        String[] inputs = {"Noelle", "Jake", "NaDario", "Dina"};
        StringExercise.foundStudents(students, inputs);
    }

    static void phoneBookExercise() {

        PhoneBook phone1 = new PhoneBook();

        phone1.addEntry("bob", "857-384-1234");
        phone1.addEntry("Elizabeth", "484-584-2923");
        phone1.addEntry("Alice", "703-493-1834");


        System.out.println("Elizabeth\t\t" + phone1.getNumber("Elizabeth"));
        phone1.addEntry("Kareem", "938-489-1234");
        phone1.removeEntry("Alice");
        phone1.updateEntry("bob", "968-345-2345");

        phone1.printAll();

    }

    static void sumNumbers() {

        //Sum The Numbers
        int[] inputArray = {12, 23, 34, 45, 56, 67, 78, 89};
        System.out.println(MyCollections.sumTheNumbers(inputArray));


    }

    static void largestNumber() {


        //Largest Number
        ArrayList<Double> largestNumArrayList = MyCollections.arrayListBuffer();
        System.out.println(MyCollections.largestNum(largestNumArrayList));


    }

    static void positiveNumber() {

        // Positive Numbers
        ArrayList<Double> mixedNumbers = MyCollections.arrayListBuffer();
        ArrayList<Double> positives = MyCollections.whoIsPositive(mixedNumbers);
        System.out.println(positives);
        for (Double d : positives) {
            System.out.println(d);
        }
    }

        static void crawlingFriday() {
            String userInput = StringExercise.stringBuffer();
            StringExercise.crawlingFriday(userInput);

        }

        static void revString() {
            String myString = StringExercise.stringBuffer();
            StringExercise.reverseString(myString);

        }
        static void leet(String inString){
        StringExercise.leetSpeak(inString);
        }
        public static void letterS(String string){
        StringExercise.letterSummary(string);
        }
}
