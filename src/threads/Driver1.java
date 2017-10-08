package threads;

public class Driver1 implements Runnable{

	Thread runner;
	String name;
	
	
	
	public Driver1(String name){
		this.name = name; // create new thread
		runner = new Thread(this, this.name);
		System.out.println("thread initalized :"+this.name);
		runner.start();
	}
	
	public Driver1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("Running :"+this.name);
		try{
			for(int i = 10; i>0;i--){
				System.out.println("thread: "+this.name+"->"+i);
				Thread.sleep(100);
			}
		}catch(InterruptedException e){
			System.err.println("thread : "+this.name+" interrupted");
		}
		System.out.println("thread : "+this.name+" exiting");
	}

	public static void main(String[] args) {
		Driver1 obj = new Driver1("alpha");
		
		Driver1 obj1 = new Driver1("beta");
		
		
		
	}
}
