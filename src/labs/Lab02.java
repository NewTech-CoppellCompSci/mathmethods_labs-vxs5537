package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in);	
		System.out.println("Choose a positive integer");
		int userNum = inKey.nextInt();
		System.out.println("Choose a positive integer");
		int userNum2 = inKey.nextInt();
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE; 
		int x1=userNum;
		int x2=userNum2;
		//finding max and min of the nums
		max = Math.max(max, x1);
		max = Math.max(max, x2);
		min = Math.min(min, x1);
		min = Math.min(min, x2);
		int random = max-min+1;
		int random2 = min;
		//printing numbers inbetween max and min nums
		for (int i = 0; i<10; i++) {
			int computer = (int) (Math.random() * random + random2);
			System.out.print(computer + " ");
		}
		System.out.println("");
		
		
	}
	
	
	
	
	public static void problem02() {
		//finding radius and height of cylinder
		Scanner inKey = new Scanner(System.in);
		System.out.println("Choose radius of cylinder");
		int radius = inKey.nextInt();
		System.out.println("Choose height of cylinder");
		int height = inKey.nextInt();
		//area of cylinder
		System.out.println(Math.pow(radius, 2) * height * Math.PI);
		
		
	}

	
	

	public static void problem03() {
		//finding nums from user
		Scanner inKey = new Scanner(System.in);
		System.out.print("enter x1: ");
		double x1 = inKey.nextDouble();
		System.out.print("enter y1: ");
		double y1 = inKey.nextDouble();
		System.out.print("enter x2: ");
		double x2 = inKey.nextDouble();
		System.out.print("enter y2: ");
		double y2 = inKey.nextDouble();
		//finding distance between points
		System.out.println( Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
		
		
	}


	
	
	public static void problem04() {
		//finding 3 numbers 
		Scanner inKey = new Scanner(System.in);
		System.out.print("enter a: ");
		double a = inKey.nextDouble();
		System.out.print("enter b: ");
		double b = inKey.nextDouble();
		System.out.print("enter c: ");
		double c = inKey.nextDouble();
		//printing x int of nums
		System.out.println("x1 = " + ((-1*b + Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a) ));
		System.out.println("x2 = " + ((-1*b - Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a) ));

		
		
	}
	
	

	
}
