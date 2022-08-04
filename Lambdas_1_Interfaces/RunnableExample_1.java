package Lambdas_1_Interfaces;

public class RunnableExample_1 {
	public static void main(String[] args) {

		/* With simple approach */
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside runnable 1");
			}
		};

		Thread t1 = new Thread(runnable);
		t1.start();

		/* With java 8 approach */
		Runnable runnable2 = () -> {
			System.out.println("Inside runnable 2");
		};
		Thread t2 = new Thread(runnable2);
		t2.start();
	}
}
