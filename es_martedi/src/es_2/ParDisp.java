package es_2;

import java.util.ArrayList;
import java.util.List;

public class ParDisp {
    public List<Integer> paridisp(List<Integer> numeri, boolean vf) {
        List<Integer> paridisp = new ArrayList<Integer>();
        
        if (vf == false) {
        	for (int i=0;i<numeri.size();i++) {
        		if(i%2 == 0) {
        			paridisp.add(numeri.get(i));
        		}
        	}
        } else {
        	for (int i=0;i<numeri.size();i++) {
        		if(i%2 == 1) {
        			paridisp.add(numeri.get(i));
        		}
        	}
        }
        
        return paridisp;
    }
}
