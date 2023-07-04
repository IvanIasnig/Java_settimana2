package es_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomizzatore {
    public List<Integer> generaNumeriCasuali(int num) {
        List<Integer> numeri = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i=0;i<num;i++) {
            int x= rand.nextInt(101);
            numeri.add(x);
        }
        return numeri;
    }
}


