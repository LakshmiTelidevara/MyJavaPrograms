package com.hcl.hw;

import java.util.*;  
import java.util.stream.Collectors;  
class Bank2{  
    int id;  
    String bankName;  
    float interestRate;  
    public Bank2(int id, String bankName, float interestRate) {  
        this.id = id;  
        this.bankName = bankName;  
        this.interestRate = interestRate;  
    }  
}  
public class CollectorsClassPractice {  
    public static void main(String[] args) {  
        List<Bank2> bankList = new ArrayList<Bank2>();  
        //Adding Products  
        bankList.add(new Bank2(1,"ABN Amro Bank",3.0f));  
        bankList.add(new Bank2(2,"Bank of America",3.0f));  
        bankList.add(new Bank2(3,"Wells Fargo",1.7f));  
        bankList.add(new Bank2(4,"City Bank",0.8f));  
        bankList.add(new Bank2(5,"JPMorgan Chase",2.8f));  
        Set<Float> bankInterestList2 =bankList.stream() 
        		.map(s->s.interestRate)
        		.collect(Collectors.toSet());
        System.out.println(bankInterestList2);
        //The repeated value (3.0) is ignored by the Set while printing out the output
    }
}
