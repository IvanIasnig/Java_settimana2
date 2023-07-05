package es_2;

import java.util.Random;

public class ThreadMain {
	public static void main(String[] args) {
	int[] array = new int[3000];
	Random rand = new Random();
		
	for (int i=0; i<3000; i++) {
		array[i]= rand.nextInt(11);
		}
	
	ThreadMio arr1 = new ThreadMio(array,0,1000);
	ThreadMio arr2 = new ThreadMio(array,1000,2000);
	ThreadMio arr3 = new ThreadMio(array,2000,3000);
	
	arr1.start();
	arr2.start();
	arr3.start();
	
	try {
		arr1.join();
		arr2.join();
		arr3.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	int total = arr1.getRis() + arr2.getRis() + arr3.getRis();

	System.out.println("La somma è: " + total);
	
	}
}