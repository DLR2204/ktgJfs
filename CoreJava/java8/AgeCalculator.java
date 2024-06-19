package java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
		LocalDate currentdate = LocalDate.now();
		
		LocalDate birthdate  = LocalDate.of(2004, 04,04);
		
		Period p = Period.between(birthdate, currentdate);
		
		System.out.printf("Your age is :- %d years ,%d months , %d days",p.getYears(),p.getMonths(),p.getDays());;
		
		
		
	}

}
