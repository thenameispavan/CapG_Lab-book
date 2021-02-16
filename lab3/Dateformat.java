package lab3;

import java.util.*;
import java.time.*;
import java.text.*;

public class Dateformat {
	public static void getDate(int day, int month, int year) {
		LocalDate date1= LocalDate.of(year, month, day);
		LocalDate date2= LocalDate.now();
		Period diff= Period.between(date1, date2);
		System.out.printf(""+ Math.abs(diff.getDays())+" days " +Math.abs(diff.getMonths())+" months " +Math.abs(diff.getYears())+" years ");
	}

	public static void main(String[] args) throws ParseException {
		Scanner s= new Scanner(System.in);
		int day= s.nextInt();
		int month= s.nextInt();
		int year= s.nextInt();
		getDate(day,month,year);
	}

}
