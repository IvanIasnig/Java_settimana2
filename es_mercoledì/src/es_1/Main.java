package es_1;

public class Main {

	public static void main(String[] args) {
		
		SecondoThread tr1 = new SecondoThread("*");
		Primothread tr2 = new Primothread("#");
		
		tr1.start();
		tr2.start();
	}

}
