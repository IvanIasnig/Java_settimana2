package es_3;

import java.io.File;


public class App {
	private static File myFile = new File("info.txt");

	public static void main(String[] args) {
		RegistroPresenza regPres = new RegistroPresenza();

		regPres.addPresenza("Salta Lacorda", 11);
		regPres.addPresenza("Mario Rossi", 7);
		regPres.addPresenza("Piazzalabomba Escappa", 19);

		regPres.writeOnFile(myFile);
		regPres.readFromFile(myFile);
		regPres.printMyFile();

	}

}
