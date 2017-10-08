package enums;

public enum Enum2 {
	PENNY("pennny"),
	NICKLE("nickle"),
	DIME("dime"),
	QUARTER("quarter");
	
	String value;
	private Enum2(String value) {
		this.value = value;
	}
	
	public static Enum2 fromValue(String value){
		for(Enum2 enum2:Enum2.values()){
			if(enum2.toString().equals(value)){
				return enum2;
			}
		}
		return null;
	}
	
	@Override
	public String toString(){
		return this.value;
	}
}
