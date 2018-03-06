package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MyCollections {
    //Sum The Numbers
    public static int sumTheNumbers(int[] inputArray) {
        int sum = 0;

        for (int i : inputArray) {
            sum += i;
        }
        return sum;

    }
    //Creating largest number method
    public static Double largestNum(ArrayList<Double> largestNumArrayList) {

        return Collections.max(largestNumArrayList);
    }

    //creating Buffered Reader Method to create Array List of 7 numbers
    public static ArrayList<Double> arrayListBuffer() {
        ArrayList<Double> myArrayList = new ArrayList<Double>();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try{

            for (int i = 0; i < 7; i++ ) {
                System.out.println("Please put in a number");
                Double input = Double.parseDouble(console.readLine());
                myArrayList.add(input);
            }

        }catch (Exception e) {
            System.out.println(e);
        } finally

        {
            try {
                console.close();
            } catch (Exception e) {

            }
            console = null;
        }
        return myArrayList;

    }


    public static ArrayList<Double> whoIsPositive(ArrayList<Double> mixedArrayList){
        ArrayList<Double> positives = new ArrayList<Double>();

        for(Double x : mixedArrayList){
            if(x > 0){
                positives.add(x);
            }
        }

        return positives;
    }
}



