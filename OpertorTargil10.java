package Opertorim;

import java.util.Scanner;

public class OpertorTargil10 {
	
	public static void main(String[] args) {
		//����� ������ �����
	Scanner in = new Scanner(System.in);
	int count;double price,sum = 0,payment;
	//  ����� ����� ������ ����� ����
	System.out.println("enter product:");
	//����� ������� ������
	price=in.nextDouble();
	count=in.nextInt();
	//����� ����� ������ ����� ����
		System.out.println("enter price:");
	//����� 
	sum+=price*count;
	//����� ������ ������
	System.out.println("Number of guides is:"+ sum +" Another group is missing:"+sum);
	
	
	System.out.println("Enter payment:");
	//����� ������� ������
	payment=in.nextDouble();
	payment-=sum;
	System.out.println("Excess: "+ payment);
	
	}

}
