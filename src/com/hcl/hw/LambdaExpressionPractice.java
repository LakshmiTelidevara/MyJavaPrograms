package com.hcl.hw;

@FunctionalInterface  //It is optional  
interface Average{  
    public void avg();  
}  
  
public class LambdaExpressionPractice {  
    public static void main(String[] args) {  
        int x=10; 
        int y = 20;
          
        //with lambda  
        Average s=()->{  
            System.out.println("Average "+((x+y)/2));  
        };  
        s.avg();  
        
    }  
}  
