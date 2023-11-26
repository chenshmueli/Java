package Opertorim;

import java.util.Scanner;

public class OpertorTargil9 {
	
	public static void main(String[] args) {
		//הגדרת משתנים וסקנר
	Scanner in = new Scanner(System.in);
	int	numStudents;
	//הדפסת הודעה למשתמש לקלוט מספר סטודנטים
	System.out.println("Enter number of students");
	//קליטה מהמשתמש למשתנה
	numStudents=in.nextInt();
	//חישוב 
	
	//הדפסת החישוב למשתמש
	System.out.println("Number of guides is:"+ (numStudents/12)+" Another group is missing:"+(12-numStudents%12));
	
	}

}
