package Opertorim;

import java.util.Scanner;

public class OpertorTargil4 {
	
	public static void main(String[] args) {
		//����� ������ �����
	Scanner in = new Scanner(System.in);
	int	towDigitNum,digit10,digit;
	//����� ����� ������ ����� ���� �� �����
	System.out.println("Enter a two-digit number");
	//����� ������� ������
	towDigitNum=in.nextInt();
	//����� 
	digit=towDigitNum%10;
	digit10=towDigitNum/10;
	//����� ������ ������
	System.out.println("Sum of digits: "+ (digit+digit10));
	
	
	}

}
