package de.haeherfeder.prime;
import java.util.Scanner;
/**
 * it prints out a list of the first x primes.
 * it dependens on de.haeherfeder.prime.prime and uses(/imports) java.util.Scanner (for the input)
 * 
 * 
 * @author Haeherfeder 
 * @version 1.0.0 stable
 * 
 */
public class PrimeListNot_ln
{
    // instance variables - replace the example below with your own
    private int x;
    Prime prime = new Prime(0);
    /**
     * It uses an input to print out the first x primes. it tries each nummber, if it is a prime with de.haeherfeder.prime.prime.isPr(); 
     */
    public PrimeListNot_ln()
    {
       Scanner user_input = new Scanner( System.in );
       try{
          x = Integer.parseInt(user_input.next());
          user_input.close();}
       catch(NumberFormatException e){
          System.out.println("Ungültige Eingabe");
          new PrimeListNot_ln();
       }
       System.out.print("Die ersten "+x+" Primzahlen sind: ");
       new PrimeListNot_ln(x);
       return;
    }
    /**
     * It is like PrimeListNot_ln(), but it uses the input x as number of primes.
     */
    public PrimeListNot_ln(int x)
    {
       int i=1;
       while(0<x){
           if(prime.isPr(i)){
               if(!(1==i)){
                   System.out.print(i+"; ");
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