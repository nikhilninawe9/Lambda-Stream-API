package Lambdas_1_Interfaces;

public class A implements Runnable {

	@Override
	public void run() {
		System.out.println("asd");

	}

	public static void main(String[] args) {
		A a = new A();
		Thread t = new Thread(a);
		t.start();
	}

}
