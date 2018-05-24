
public class testOne {
	public static void main(String[]args) {
		Thread firstThread = new Thread(new RunnableOne());
		Thread secondThread = new Thread(new RunnableTwo());
		firstThread.start();
		secondThread.start();
		System.out.println("mainThread");
	}
}

class RunnableOne implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable One");
	}
	
}

class RunnableTwo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable Two");
	}
	
}
