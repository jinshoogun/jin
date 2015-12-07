package ex09_13;

public class EnumExample3 {
	public static void main (String args[]){
		printSeason(Season.SPRING);
		printSeason(Season.SUMMER);
		printSeason(Season.FALL);
		printSeason(Season.WINTER);
	}
	static void printSeason(Season season) {
		System.out.println();
		System.out.println("season.value() = " + season.value());
		System.out.println("season.name() = " + season.name());
		System.out.println("season.ordinal() = " + season.ordinal());
	}

}
