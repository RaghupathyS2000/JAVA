package learningjava;
enum Level{//Enum java.lang.Enum
	BEGINNER("B"),INTERMEDIATE("I"),ADVANCED("A");//final/constant in captial letters
	private String abbr;
	Level(String ab){
		abbr=ab;
	}
	public String getAbbr() {
		return abbr;
	}
}
public class EnumDemo {
 public static void main(String[] args) {
	Level l1= Level.ADVANCED;
	System.out.println(l1);
	System.out.println(l1.getAbbr());
	System.out.println(l1.ordinal());
}
}
