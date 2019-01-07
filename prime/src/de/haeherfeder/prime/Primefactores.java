package de.haeherfeder.prime;
import java.util.Scanner;

/**
 * it dependens on de.haeherfeder.prime.prime and uses(/imports) java.util.Scanner (for the input)
 * 
 * @author Haeherfeder 
 * @version 1.0.1 stable
 */
public class Primefactores
{
    // instance variables - replace the example below with your own
    private long x;
    Prime prime = new Prime(0);
    Scanner user_input = new Scanner( System.in );
    public static void main(String[] args) {
        new Primefactores();
        main(null);
    }
    
    /**
     * Constructor for objects of class primefactores
     */
    public Primefactores()
    {
        try{
        x = Integer.parseInt(user_input.next());}
        catch(NumberFormatException e){
            System.out.println("Ungültige Eingabe");
            main(null);
        }
        System.out.print(x+" hat folgende Primfaktoren: ");
        for(int i=1;i<x+1;i++){
            if(x % i==0){
                if(prime.isPr(i)){
                    System.out.print(i+"; ");
                }
            }
        }
        System.out.println();
    }
}