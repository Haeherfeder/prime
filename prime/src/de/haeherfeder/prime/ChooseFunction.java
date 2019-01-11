package de.haeherfeder.prime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * is the class to choose what you do, and starts the other classes of this package.
 * 
 * @author Haeherfeder
 * @version 1.1.0 stable
 */
public class ChooseFunction
{
    /**
     * starts the Programm
     */
    public static void main(String[] args) {
        new ChooseFunction();
        try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        main(null);
    }
    /**
     * asks the user for an input, and starts the other class.
     */
    public ChooseFunction()
    {
    	@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
    	System.out.println("Choose an option: \n 1 Know if a number is prime and, if necessary, its factors \n 2 List the prime factors of a number \n  2.1 Make the prime factor decomposition of a number. \n 3 List the first x prime numbers \n  3.1 like three, but without changing the line \n  3.2 Test (equal to 3) \n 4 The x. Show prime number \n exit to leave the program\n\n");
        System.out.println("Wählen sie eine Option:\n 1 Wissen ob eine Zahl eine Primezahl ist, und ggf. seine Faktoren\n 2 Die Primefaktoren einer Zahl auflisten\n  2.1 Die Primefaktorzerlegung einer Zahl machen. \n 3 Die ersten x Primezahlen auflisten\n  3.1 wie drei, aber ohne die Zeile zu wechseln\n  3.2 Test(gleich 3.0) \n 4 Die x. Primzahl anzeigen\n exit um das Programm zu verlassen");
        String inp = "false";
		inp = user_input.next();
//        System.out.println(inp);
        switch(inp){
            case "1":
                new Prime();
                break;
            case "2":
                new Primefactores();
                break;
            case "3":
                new Primelist();
                break;
            case "3.1":
                new PrimeListNot_ln();
                break;
            case "4":
                new Primenum();
                break;
            case "2.1":
                new Primefactores2();
                break;
            case "3.2":
            	new PrimeListArray();
            	break;
            case "exit":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}