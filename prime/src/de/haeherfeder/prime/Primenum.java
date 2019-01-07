package de.haeherfeder.prime;
import java.util.Scanner;

/**
 * it dependens on de.haeherfeder.prime.prime and uses(/imports) java.util.Scanner (for the input)
 * 
 * @author Haeherfeder 
 * @version 1.0.0 stable
 * 
 */
public class Primenum
{
    private Prime prime = new Prime(0);
    private int x;
    /**
     * starts primenum();
     */
    public static void main(String[] args) {
        new Primenum();
    }
    /**
     * ask a user for an number, and does primenum(x);
     */
    public Primenum()
    {
       System.out.println("Welche Primzahl wollen Sie wissen?");
       Scanner user_input = new Scanner( System.in );
       try{
            x = Integer.parseInt(user_input.next());
            user_input.close();}
       catch(NumberFormatException e){
            System.out.println("Ungültige Eingabe");
            main(null);
       }
       System.out.print("Die "+x+". Primzahl ist ");
       new Primenum(x);
    }
    /**
     * print out the x. prime
     */
    public Primenum(int x){
       int i=1;
       while(0<x+1){
           if(prime.isPr(i)){
               if(x==0)
               System.out.println(i);
               x--;
           }
           //System.out.println(i);
           i++;
       }
       System.out.println();
    }
}