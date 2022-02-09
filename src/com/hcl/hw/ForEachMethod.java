package com.hcl.hw;

import java.util.ArrayList;  
import java.util.List;  
public class ForEachMethod {  
    public static void main(String[] args) {  
        List<String> subjectList = new ArrayList<String>();  
        subjectList.add("1. Science");  
        subjectList.add("2. Math");  
        subjectList.add("3. Biology");  
        subjectList.add("4. Compter Science");  
        System.out.println("-----Subjects in a high school----");  
        subjectList.forEach(System.out::println);  
    }  
}  
