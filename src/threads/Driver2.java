package threads;

public class Driver2 extends Thread {
	private String name;
	
	public Driver2(String name,Integer priority) {
		this.name = name;
		System.out.println("Thread name :"+this.name);
		new Thread(this,this.name);
		this.setPriority(priority);
		this .start();
	}
	
	public void run(){
		System.out.println("running :"+this.name);
		try{
			System.out.println("Creating "+ this.name);
			for(int i = 10; i>0;i--){
				System.out.println("Thread "+ this.name + "->"+i);
				Thread.sleep(100);
			}
		}catch(InterruptedException e){
			System.err.println("Thread name :"+this.name+"interrupted");
		}
		System.out.println("Thread exiting :"+this.name);
	}
	
	public static void main(String[] args) {
		Driver2 obj = new Driver2("aplha",Thread.MAX_PRIORITY);
		Driver2 obj1 = new Driver2("beta",Thread.MIN_PRIORITY);
	}
}
