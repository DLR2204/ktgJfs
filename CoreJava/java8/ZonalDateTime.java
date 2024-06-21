package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonalDateTime {
	
	public static void main(String[] args) {
		
		/*
		 * Set<String> set = ZoneId.getAvailableZoneIds();
		 * 
		 * for(String value : set) { System.out.println(value); }
		 */
		
		
		  ZoneId zone = ZoneId.of("America/Chicago");
		  
		  ZonedDateTime time = ZonedDateTime.now(zone);
		  
		  System.out.println(time);
		 
	}

}
