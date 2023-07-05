package es_2;

public class ThreadMio extends Thread {
    int[] array;
    int start;
    int end;
    int ris; 

    public ThreadMio (int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        ris = 0;
        for(int i=start; i<end; i++) {
            ris = ris + array[i];
        }
    }

    public int getRis() {
        return ris; 
    }
}

