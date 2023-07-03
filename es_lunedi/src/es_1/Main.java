package es_1;

import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	   public static void main(String[] args) {
	        Random rand = new Random();
	        Scanner scanner = new Scanner(System.in);

	        int[] array = new int[5];
	        for (int i = 0; i < array.length; i++) {
	            array[i] = 1 + rand.nextInt(10);
	        }

	        stampaArray(array);


	        while (true) {
	            System.out.println("Inserisci un numero (0 per uscire):");
	            int num = scanner.nextInt();
	            if (num == 0) {
	                break;
	            }

	            System.out.println("Inserisci una posizione:");
	            int pos = scanner.nextInt();

	            try {
	                array[pos] = num;
	            } catch (ArrayIndexOutOfBoundsException e) {
	                logger.error("Posizione non valida: " + pos, e);
	                continue;
	            }

	            stampaArray(array);
	        }

	        scanner.close();
	    }

	    private static void stampaArray(int[] array) {
	        System.out.print("Array: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}