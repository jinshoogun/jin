package ex11_05;

import java.util.TimeZone;

public class TimeZoneIDS {
	public static void main(String args[]){
		for (String name : TimeZone.getAvailableIDs())
			System.out.println(name);
	}

}
