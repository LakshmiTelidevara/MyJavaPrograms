package com.hcl.hw;

import java.util.Optional;  
public class OptionalClassPractice {  
    public static void main(String[] args) {  
        String[] string = new String[8];        
        string[3] = "Dallas CITY";  // Setting value for 5th index  
        Optional<String> checkNull = Optional.ofNullable(string[3]);  
        checkNull.ifPresent(System.out::println);   // printing value by using method reference  
        System.out.println(checkNull.get());    // printing value by using get method  
        System.out.println(string[3].toLowerCase());     
    }  
}  
