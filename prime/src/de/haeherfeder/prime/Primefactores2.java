package de.haeherfeder.prime;
import java.util.Scanner;

/**
 * it dependens on de.haeherfeder.prime.prime and uses(/import) java.util.Scanner (for the input)
 * 
 * @author Haeherfeder 
 * @version 1.0.1 unstable
 */
public class Primefactores2
{
    // instance variables - replace the example below with your own
    private int x;
    Prime prime = new Prime(0);
    Scanner user_input = new Scanner( System.in );
    public static void main(String[] args) {
        new Primefactores2();
        //main(null);
    }
    
    /**
     * Constructor for objects of class primefactores
     */
    public Primefactores2()
    {
        System.out.println("Please enter a number");
        @SuppressWarnings("resource")
		Scanner scanner = new  Scanner(System.in);
        String user_input = scanner.next();
        try{
        x = Integer.parseInt(user_input);}
        catch(NumberFormatException e){
            if(user_input=="exit"){System.exit(0); }
            System.out.println("Invalid input");
            return;
        }
        System.out.print(x+" has this primefactores: ");
        for(int i=2;i<x/2+1;i++){
            if(x % i==0){
                //System.out.print(i+"getestet ");
                if(prime.isPr(i)){
                    x = x/i;
                    System.out.print(i+"; ");
                    i--;
                    //System.out.print(x+" test ");
                }
            }
        }
        if(!prime.isPr(x)){
            System.out.println("\nEs gab einen Fehler, ist der eingegebene Wert im Wertebereich ?\n Der Rest ist "+x);
            return;
        }
        System.out.println(x);
        return;
    }
}