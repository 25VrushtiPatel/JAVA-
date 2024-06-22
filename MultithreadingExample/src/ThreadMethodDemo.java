public class ThreadMethodDemo {

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass(5,"First"); //object of ThreadClass one
		ThreadClass t2 = new ThreadClass(8,"Second");//object of ThreadClass two
		System.out.println("Current Thread: "+Thread.currentThread());// return the current thread
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("Parent Thread"); 
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		System.out.println("Current Thread: "+Thread.currentThread());
		
		try{
			t1.join();//wait current thread until the t1 is dead
			t2.join();
		}
		
		catch(Exception e) {
			System.out.println("Thread is Interrupted");
		}
		
		System.out.println("----------End of Main-----------");

	}

}
