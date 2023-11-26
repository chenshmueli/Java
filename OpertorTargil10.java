package Opertorim;

import java.util.Scanner;

public class OpertorTargil10 {
	
	public static void main(String[] args) {
		//הגדרת משתנים וסקנר
	Scanner in = new Scanner(System.in);
	int count;double price,sum = 0,payment;
	//  הדפסת הודעה למשתמש לקלוט מחיר
	System.out.println("enter product:");
	//קליטה מהמשתמש למשתנה
	price=in.nextDouble();
	count=in.nextInt();
	//הדפסת הודעה למשתמש לקלוט מחיר
		System.out.println("enter price:");
	//חישוב 
	sum+=price*count;
	//הדפסת החישוב למשתמש
	System.out.println("Number of guides is:"+ sum +" Another group is missing:"+sum);
	
	
	System.out.println("Enter payment:");
	//קליטה מהמשתמש למשתנה
	payment=in.nextDouble();
	payment-=sum;
	System.out.println("Excess: "+ payment);
	
	}

}
