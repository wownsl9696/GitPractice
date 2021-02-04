package Thread;

class TimerThread1 extends Thread{
	int n = 0;
	
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {return;}
		}
	}
}

public class TestThread {

	public static void main(String[] args) {
		TimerThread1 th = new TimerThread1();
		th.start();
	}

}
