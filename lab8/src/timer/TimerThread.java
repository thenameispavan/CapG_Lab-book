package timer;

import java.util.Date;

class MyThread123 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println(new Date());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class TimerThread {

	public static void main(String[] args) {
		MyThread123 obj= new MyThread123();
		Thread timer= new Thread(obj);
		timer.start();
	}

}
