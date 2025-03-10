//How to make thread print value one after another.

public class printOneAfterAnother extends Thread {
	public void run() {
		for (int i = 1; i < 8; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		printOneAfterAnother t1 = new printOneAfterAnother();
		printOneAfterAnother t2 = new printOneAfterAnother();

		t1.start();
		t2.start();
	}
}