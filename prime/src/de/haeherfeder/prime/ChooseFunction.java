package de.haeherfeder.prime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * is the class to choose what you do, and starts the other classes of this package.
 * 
 * @author Haeherfeder
 * @version 1.0.2 stable
 */
public class ChooseFunction
{
    private Scanner user_input = new Scanner( System.in );
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
     * asks the user for an input, and stats the other class.
     */
    public ChooseFunction()
    {
        System.out.println("Wählen sie eine Option:\n 1 Wissen ob eine Zahl eine Primezahl ist, und ggf. seine Faktoren\n 2 Die Primefaktoren einer Zahl auflisten\n 2.1 Die Primefaktorzerlegung einer Zahl machen. \n 3 Die ersten x Primezahlen auflisten\n 3.1 wie drei, aber ohne die Zeile zu wechseln  \n 4 Die x. Primzahl anzeigen\n exit um das Programm zu verlassen");
        switch(user_input.next()){
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
            case "exit":
                System.exit(0);
                break;
            default:
                System.out.println("Ungültige Eingabe/Auswahl");
                break;
        }
    }
}