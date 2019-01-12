package de.haeherfeder.prime;
import java.util.Scanner;
/**
 * it prints out a list of the first x primes.
 * it dependens on de.haeherfeder.prime.prime and uses(/imports) java.util.Scanner (for the input)
 * 
 * 
 * @author Haeherfeder 
 * @version 1.0.2 stable
 * 
 */
public class Primelist
{
    private int x;
    /**
     * It uses an input to print out the first x primes. it tries each nummber, if it is a prime with de.haeherfeder.prime.prime.isPr(); 
     */
    public Primelist()
    {
       @SuppressWarnings("resource")
       Scanner user_input = new Scanner( System.in );
       try{
          x = Integer.parseInt(user_input.next());}
       catch(NumberFormatException e){
          System.out.println("Invalid Input");
          new Primelist();
       }
       System.out.println("Die ersten "+x+" Primzahlen sind: ");
       System.out.println("The first "+x+"primenumbers are: ");
       new Primelist(x);
       return;
    }
    /**
     * It is like primelist(), but it uses the input x as number of primes.
     */
    public Primelist(int x)
    {
       Prime prime = new Prime(0);
       int i=1;
       while(0<x){
           if(prime.isPr(i)){
               if(!(1==i)){
               System.out.println(i);
               x--;
               }
           }
           //System.out.println(i);
           i++;
       }
       System.out.println();
       return;
    }
}