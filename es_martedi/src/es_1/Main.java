package es_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<String> set= new HashSet<String>();
		List<String> duplicati = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci l'N numero di parole da inserire :");
        int num = scanner.nextInt();
        scanner.nextLine();
        
        try {
            if(num < 1) {
            	throw new ArithmeticException(" Dovrai inserire almeno una parola!");
            } 
            
            int i = 0;
            System.out.println("Inserisci le tue " + num + " parole: ");
            
           while (i<num) {
            String x = scanner.nextLine();
            if(set.contains(x)) {
            	duplicati.add(x);
            	}
            set.add(x);
            i++;
           }
           System.out.println("parole:" + set);
           System.out.println("numero di parole distinte: " + set.size());
           System.out.println("duplicati: " + duplicati);
           
        } catch (ArithmeticException e) {
        	System.out.println(e.getMessage());
        } finally {
        	scanner.close();
        }

	}

}
