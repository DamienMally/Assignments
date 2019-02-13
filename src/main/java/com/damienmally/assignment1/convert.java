package com.damienmally.assignment1;


public class convert {
    
    public static void main(String args[]){
      
        milesToKm conv = new milesToKm();
        
        double a = 5;
        
        double Answer = conv.convertToKm(5);
        
        System.out.println(a + " miles is equal to "+ Answer + "kilometres");
  }  
}
