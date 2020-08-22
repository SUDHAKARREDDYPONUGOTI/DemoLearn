package Arrays;

public class Mythread extends Thread{
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Hello Therad");
			
		}
		
	}
	
	public void run(int i) {
		
		for (int k = 0; k < 2; k++) {
			
			System.out.println("Hello Therad");
			
		}
		
	}


}
