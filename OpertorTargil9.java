package Opertorim;

import java.util.Scanner;

public class OpertorTargil9 {
	
	public static void main(String[] args) {
		//����� ������ �����
	Scanner in = new Scanner(System.in);
	int	numStudents;
	//����� ����� ������ ����� ���� ��������
	System.out.println("Enter number of students");
	//����� ������� ������
	numStudents=in.nextInt();
	//����� 
	
	//����� ������ ������
	System.out.println("Number of guides is:"+ (numStudents/12)+" Another group is missing:"+(12-numStudents%12));
	
	}

}
