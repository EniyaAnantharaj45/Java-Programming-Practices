package DicisionMaking;

import java.util.Scanner;
public class Bonus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Bonus");
		int exp=sc.nextInt();
		
		
		
		if(exp>=10) {
			System.out.println("Bonus=30%");
		}else if(exp>=5) {
			System.out.println("Bonus=20%");
		}else if(exp>=2) {
			System.out.println("Bonus=65%");
		}else {
			System.out.println("Is Not Bonus");
		}
		
	}

}
