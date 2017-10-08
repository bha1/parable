package enums;

public enum Enum3 {
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);
	
	int value;
	private Enum3(int value) {
		this.value = value;
	}
	
	public static Enum3 fromValue(int value){
		for(Enum3 enum3:Enum3.values()){
			if(enum3.value == value){
				return enum3;
			}
		}
		return null;
	}
	
	@Override
	public String toString(){
		return String.valueOf(this.value);
	}
}
