package com.company;

import java.util.HashMap;

public class PhoneBook {
    public HashMap<String, String> myPhoneBook= new HashMap<String, String>();

   public PhoneBook(){

    }

   public void addEntry(String name, String number){

        this.myPhoneBook.put(name, number);
    }

    public String getNumber(String name){

        return myPhoneBook.get(name);

    }
    public void removeEntry(String name){
       this.myPhoneBook.remove(name);
    }

    public void updateEntry(String name, String number){
        this.myPhoneBook.replace(name, number);

    }

    public void printAll(){

       for(String s : this.myPhoneBook.keySet()){
           System.out.println(s + "\t\t" + myPhoneBook.get(s));
       }
    }
}
