package threads;

public class Driver3 extends Thread {
	private Thread waitFor;
	private String name;
	
	public Driver3(String name,Integer priority,Thread waitFor) {
		this.name = name;
		this.waitFor = waitFor;
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
				if(this.name.equals("aplha")){
					Thread.sleep(1000);
				}else{
					Thread.sleep(100);
				}
//				Driver3.dumpStack();
			}
		}catch(InterruptedException e){
			System.err.println("Thread name :"+this.name+"interrupted");
		}
		
		if(waitFor != null){
			try{
				waitFor.join();
			}catch(InterruptedException e){
				System.err.println("Thread name :"+this.name+" inturrepted while join");
			}
		}
		System.out.println("Thread exiting :"+this.name);
	}
	
	public static void main(String[] args) {
		Driver3 obj = new Driver3("aplha",Thread.MAX_PRIORITY,null);
		Driver3 obj1 = new Driver3("beta",Thread.MIN_PRIORITY,obj);
	}
}
