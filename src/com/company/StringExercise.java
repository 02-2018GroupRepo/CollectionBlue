package com.company;

public class StringExercise {
    private String builder;


    public void concateMethod(String str1, String str2){
        this.builder = str1 + " " + str2;
    }

    public String getBuilder() {
        return builder;
    }

}
