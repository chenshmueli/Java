package Targilim;

import java.util.Scanner;

public class Targil6 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int days,weeks;
		
		System.out.println("Enter number day");
		
		days=in.nextInt();
		
		System.out.println("number weeks: " + days/7);
		
		System.out.println(" number days: " + days%7);
		

	}

}
