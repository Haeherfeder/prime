package de.haeherfeder.prime;

import java.util.Scanner;
/**
 * imports java.util.Scanner;
 * 
 * @author Haeherfeder 
 * @version 1.0.3 stable
 * 
 */
public class Prime
{
    // instance variables
        private long x;
        Scanner user_input = new Scanner( System.in );
    /**
    * Starts the prime, if you want to use this class without other Starter classes.
    */
    public static void main(String[] args) {
        new Prime();
        main(null);
    }
    /**
     * method for say if it is a prime and say all factors (without himself) of an number if it isnt a prime.
     */
    public Prime(long x)
    {
        if(x==0){} else{
            if(isPr(x)){
               System.out.println(x+" is a prime.");
            }
            else{
                System.out.print(x+" is not a prime, because of these factors: ");
                for(long i=1;i<x/2+1;i++){
                    if(x % i==0){
                        System.out.print(i+"; ");
                    }
                }
                System.out.println();
            }
        }
        return;
    }
    /**
     * the method which profe if it is an prime
     * (true = it is a prime;false=it is not a prime.)
     */
    public boolean isPr(long x){
        if(x<0){return false;}
        for(long i=2;i<Math.sqrt(x)+1;i++){
            if(x % i==0){
                if(i==x){
                    return true;
                }
                return false;
            }
            //System.out.println(i+" wurde geprüft für "+x);
        }
        return true;
    }
    /**
     * like prime(int x), but it it asks the user for the number.
     */
     public Prime(){
    	System.out.println("Please enter the number");
        try{
             x = Long.parseLong(user_input.next());}
        catch(NumberFormatException e){
            System.out.println("Invalid Input/Ungültige Eingabe");
            new Prime();
        }
        if(x<0){
            System.out.println("Invalid Input/Ungültige Eingabe");
            new Prime();
        }
         new Prime(x);
    }
}