package es_2;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	   public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Inserisci i km :");
            double km = scanner.nextInt();
	        System.out.println("Inserisci i litri :");
	        double litri = scanner.nextInt();
	        
	        try {
                if(litri == 0) {
                	throw new ArithmeticException(" I litri non possono essere 0!");
                } 
               double ris = km / litri;
                System.out.println("I km/litro della tua auto sono: " + ris);
            } catch (ArithmeticException e) {
                logger.error(e.getMessage());
            } finally {
            	scanner.close();
            }

	   }
	}
