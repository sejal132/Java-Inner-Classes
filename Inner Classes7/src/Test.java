//here anonymous inner class is declared for the runnable interface 
//inside the arguments of the object of class Thread

public class Test {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}
			}

		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
		// TODO Auto-generated method stub

	}

}
