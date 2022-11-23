package Day2Problems;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month : ");
		int month=sc.nextInt();
		System.out.println("Enter a day : ");
		int day=sc.nextInt();
		
		if((month<=3 && day<=20) || (month>=6 && day>=20)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		

	}

}
