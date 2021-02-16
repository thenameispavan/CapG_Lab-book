package lab1;

import java.util.Scanner;
public class TrafficLights {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter the colour: ");
		String colour= input.next();
		switch(colour) {
		case "red": System.out.println("Stop!"); break;
		case "yellow": System.out.println("Start"); break;
		case "green": System.out.println("Go!"); break;
		default: System.out.println("no colour selected");
		}
		}
		
	}

