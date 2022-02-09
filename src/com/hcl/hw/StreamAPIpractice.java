package com.hcl.hw;

import java.util.*;  
import java.util.stream.Collectors;  
class Bank{  
    int id;  
    String bankName;  
    float interestRate;  
    public Bank(int id, String bankName, float interestRate) {  
        this.id = id;  
        this.bankName = bankName;  
        this.interestRate = interestRate;  
    }  
}  
public class StreamAPIpractice {  
    public static void main(String[] args) {  
        List<Bank> bankList = new ArrayList<Bank>();  
        //Adding Products  
        bankList.add(new Bank(1,"ABN Amro Bank",3.0f));  
        bankList.add(new Bank(2,"Bank of America",2.0f));  
        bankList.add(new Bank(3,"Wells Fargo",1.7f));  
        bankList.add(new Bank(4,"City Bank",0.8f));  
        bankList.add(new Bank(5,"JPMorgan Chase",2.8f));  
        List<Float> bankInterestList2 =bankList.stream()  
                                     .filter(s -> s.interestRate >2.0 )// filtering data  
                                     .map(s->s.interestRate)        // fetching interest rate 
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(bankInterestList2);  
    }  
}  
