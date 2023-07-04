package es_2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'N numero di numeri randomici desiderati :");
        int num = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        try {
            if(num < 1) {
                throw new ArithmeticException(" Dovrai ricevere almeno un numero!");
            } 
            Randomizzatore generator = new Randomizzatore();
            List<Integer> numeri = generator.generaNumeriCasuali(num);
            System.out.println("array: " + numeri);
            
            Inverso invgen = new Inverso();
            List<Integer> inverso = invgen.inverso(numeri);
            System.out.println("inverso:" + inverso);
            
            ParDisp pd = new ParDisp();
            List<Integer> paridisp = pd.paridisp(numeri, true);
            System.out.println("numeri posizionali:" + paridisp);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}


