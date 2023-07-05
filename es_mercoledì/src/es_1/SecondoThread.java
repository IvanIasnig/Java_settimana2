package es_1;

public class SecondoThread extends Thread {
	public String car1;
	
	public SecondoThread (String car1) {
		this.car1 = car1;
	}
	
	@Override
	public void run() {
			try {
				for (int i=0; i<10; i++) {
					System.out.println(car1);
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("interrotto");
				e.printStackTrace();
			}
		}
	}

