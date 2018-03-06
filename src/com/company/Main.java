package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        //Sum The Numbers
        int[] inputArray = {12, 23, 34, 45, 56, 67, 78, 89};
        System.out.println(MyCollections.sumTheNumbers(inputArray));

        //Largest Number
        //ArrayList<Double> largestNumArrayList = MyCollections.arrayListBuffer();
        //System.out.println(MyCollections.largestNum(largestNumArrayList));

        // Positive Numbers
        ArrayList<Double> mixedNumbers = MyCollections.arrayListBuffer();
        ArrayList<Double> positives = MyCollections.whoIsPositive(mixedNumbers);
        System.out.println(positives);
        for(Double d : positives) {
            System.out.println(d);
        }
    }



}
