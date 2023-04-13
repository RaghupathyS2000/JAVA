package learningjava;
//class Book  implements Runnable{
	
	//}
class Num extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		}
	}
}

public class multithreadingDemo {
	public static void main(String[] args) throws InterruptedException {
		Runnable book  = new Runnable () {//anonymous class
			public void run(){
				for (int i=1;i<=5;i++) {
					System.out.println("Updating Details");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				
				}
			}
			}
		};
		// we can use lambda expression also
		/*
		 * Runnable book =() ->{
		 * 
				for (int i=1;i<=5;i++) {
					System.out.println("Updating Details");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				
				}
			}
		};
		 */
		//behaves like a thread becaz we extending thread class
		Num n=new Num();
		Thread t1=new Thread(book);// creating thread object becz class is not extending thread
		t1.start();
		n.start();
		t1.setName("book1");
		System.out.println(t1.getName());
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		//if(b.isAlive()) {
			//System.out.println("Still Executing....");
		//}
		//b.join();
		//n.join();// main thread will wait after execution of thread only other statement executed
		//if(b.isAlive()) {
			//System.out.println("Still Executing....");
		//}
		System.out.println("Byeeee");
	}

}
