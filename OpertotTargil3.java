package Opertorim;

import java.util.Scanner;

public class OpertotTargil3 {

	public static void main(String[] args) {
		//הגדרת משתנים וסקנר
	Scanner in = new Scanner(System.in);
	double	squareSide;
	//הדפסת הודעה למשתמש לקלוט אורך צלע ריבוע
	System.out.println("Enter square side:");
	//קליטה מהמשתמש למשתנה
	squareSide=in.nextDouble();
	//הדפסת החישוב למשתמש
	System.out.println("Square area is: "+ squareSide*squareSide);
	System.out.println("Square scope is: "+ squareSide*4);
	
	
	}

}
