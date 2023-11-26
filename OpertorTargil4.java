package Opertorim;

import java.util.Scanner;

public class OpertorTargil4 {
	
	public static void main(String[] args) {
		//הגדרת משתנים וסקנר
	Scanner in = new Scanner(System.in);
	int	towDigitNum,digit10,digit;
	//הדפסת הודעה למשתמש לקלוט מספר דו ספרתי
	System.out.println("Enter a two-digit number");
	//קליטה מהמשתמש למשתנה
	towDigitNum=in.nextInt();
	//חישוב 
	digit=towDigitNum%10;
	digit10=towDigitNum/10;
	//הדפסת החישוב למשתמש
	System.out.println("Sum of digits: "+ (digit+digit10));
	
	
	}

}
