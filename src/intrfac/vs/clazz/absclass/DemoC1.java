package intrfac.vs.clazz.absclass;


/**
 * @author bhawan
 * Difference 1 : Astract class can extend only one class or obstract class
 *1 	 An abstract class can extend only one class or one abstract class at a time 	 An interface can extend any number of interfaces at a time
 *2 	  An abstract class can extend another concrete (regular) class or abstract class 	 An interface can only extend another interface
 *3 	 An abstract class can have both abstract and concrete methods 	 An interface can have only abstract methods
 *4 	 In abstract class keyword “abstract” is mandatory to declare a method as an abstract 	 In an interface keyword “abstract” is optional to declare a method as an abstract
 *5 	 An abstract class can have protected and public abstract methods 	 An interface can have only have public abstract methods
 *6 	 An abstract class can have static, final or static final variable with any access specifier 	 interface can only have public static final (constant) variable
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