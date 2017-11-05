package threads;

public class ThreadAVersionTwo {
	
	public static void main(String[] args) {
		ThreadC c = new ThreadC();
		c.start();
		try{
			c.join();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Total is : "+c.total);
		
	}	
	
}

class ThreadC extends Thread{
	int total;
	@Override
	public void run(){
		for(int i = 0; i<100;i++){
			total +=i;
		}
	}
}
