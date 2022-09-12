package sonataServiceExample;

public class ThreadJoinExample extends Thread{
	
	ThreadJoinExample(String s) {super(s);}
	
	public void run() {
		
		for(int i = 1;i<5; i++) { 
		try {Thread.sleep(500);
		System.out.println("thread executing" + Thread.currentThread());}
			
	catch(InterruptedException e) {System.out.println((e));}
	System.out.println((i));}
}

	public static void main(String[] args) throws InterruptedException {
		ThreadJoinExample t1 = new ThreadJoinExample("one");
		ThreadJoinExample t2 = new ThreadJoinExample("two");
		ThreadJoinExample t3 = new ThreadJoinExample("three");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.join();
		
		

	}

}
