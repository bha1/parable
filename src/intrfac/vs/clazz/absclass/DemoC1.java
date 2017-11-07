package intrfac.vs.clazz.absclass;


/**
 * @author bhawan
 * Difference 1 : Astract class can extend only one class or obstract class
 *
 */
public class DemoC1 {
	public static void main(String[] args){
		Example4 obj = new Example4();
		obj.display3();
	}
}

class Example1{
	public void display1(){
		System.out.println("Display1 Metod");
	}
}

abstract class Example2{
	public void display2(){
		System.out.println("Display2 Method");
	}
}

abstract class Example3{
	abstract void display3();
}

class Example4 extends Example3{
	@Override
	public void display3(){
		System.out.println("Display3 Method");
	}
}