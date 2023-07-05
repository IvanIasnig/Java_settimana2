package es_1;

public class Primothread extends Thread {
	public String car2;
	
	public Primothread (String car2) {
		this.car2 = car2;
	}
	
	@Override
	public void run() {
			try {
				for (int i=0; i<10; i++) {
					System.out.println(car2);
				Thread.sleep(1001);
				}
			} catch (InterruptedException e) {
				System.out.println("interrotto");
				e.printStackTrace();
			}
		}
	}
