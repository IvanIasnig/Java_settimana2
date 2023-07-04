package es_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inverso {
    public List<Integer> inverso(List<Integer> numeri) {
        List<Integer> inverso = new ArrayList<Integer>(numeri);
        Collections.reverse(inverso);
        
        List<Integer> risultato = new ArrayList<Integer>(numeri);
        risultato.addAll(inverso);
        
        return risultato;
    }
}
