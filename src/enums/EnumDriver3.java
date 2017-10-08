package enums;

public class EnumDriver3 {
	public static void main(String[] args) {
			System.out.println(Enum3.DIME);
			System.out.println(Enum3.valueOf("DIME"));
			for (Enum3 enum3 : Enum3.values()) {
				System.out.println(enum3.name()+enum3.ordinal());
			}
			System.out.println(Enum3.fromValue(10).name());
	}
}
