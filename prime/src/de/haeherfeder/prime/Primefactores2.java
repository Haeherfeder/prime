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
        System.out.println("Bitte Zahl eingeben.");
        Scanner scanner = new  Scanner(System.in);
        String user_input = scanner.next();
        scanner.close();
        try{
        x = Integer.parseInt(user_input);}
        catch(NumberFormatException e){
            if(user_input=="exit"){System.exit(0); }
            System.out.println("Ungültige Eingabe");
            main(null);
        }
        System.out.print(x+" hat folgende Primfaktoren: ");
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
            main(null);
        }
        System.out.println(x);
    }
}