package sonataServiceExample;

public class RunableExample implements Runnable{
	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getId() + " is running");
			
		} catch(Exception e) {
			System.out.println((e));
		}
	}

	public static void main(String[] args) {
		RunableExample r1 = new RunableExample();
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
