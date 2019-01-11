package de.haeherfeder.prime;

import java.util.Scanner;
/**
 * for public int[] PrimeLisArray(int x), an display it.
 * 
 * @author Haeherfeder
 * @version 1.0.0 stable
 */
public class PrimeListArray {
	public PrimeListArray(String hi) {
		if(hi == "start") {
			return;
		}
		return;
	}
	public PrimeListArray() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		int x = 0;
		try{
            x = Integer.parseInt(num);
            }
       catch(NumberFormatException e){
            System.out.println("Invalid input");
            new PrimeListArray();
       }
		int[] primes = PrimeLisArray(x);
//		System.out.print(primes+"\n "+primes.length+"\n");
		for(int i=0;i<primes.length;) {
			System.out.println(primes[i]);
			i++;
		}
		
	}
	/**
     * returns the first x Primes as an Array, starts with int[0]=2;
     */
	public int[] PrimeLisArray(int x){
		Prime prime = new Prime(0);
		int i=1;
		int i2 = 0;
		int[] primelist;
		primelist = new int[x];
		while(0<x){
	        if(prime.isPr(i)){
	            if(!(1==i)){
//	            	System.out.println(i2);
	            	primelist[i2] = i;
	            	i2++;
	                x--;
	            }
	        }
	        //System.out.println(i);
	        i++;
	    }
	    System.out.println();
	    return primelist;	
	}
}