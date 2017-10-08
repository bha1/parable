package enums;

public class EnumDriver2 {
	public static void main(String[] args) {
		System.out.println(Enum2.DIME);
		
		System.out.println(Enum2.valueOf("DIME"));
		System.out.println(Enum2.fromValue("dime").name());
	}
}
