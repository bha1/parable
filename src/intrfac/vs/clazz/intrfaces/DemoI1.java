package intrfac.vs.clazz.intrfaces;


/**
 * @author bhawan
 * Difference 1 : Interface can extend multiple interfaces
 */
public class DemoI1 {
	public static void main(String[] args){
		Example4 obj = new Example4();
		obj.display1();
		obj.display2();
	}
}

interface Example1{
	public void display1();
}

interface Example2{
	public void display2();
}

interface Example3 extends Example1,Example2{
	
}

class Example4 implements Example3{
	@Override
	public void display1(){
		System.out.println("Display1 method");
	}
	
	@Override
	public void display2(){
		System.out.println("Display2 method");
	}
}