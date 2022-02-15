package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		//scanner to find positive int
		Scanner inKey = new Scanner(System.in);	
		System.out.println("Choose a positive integer");
		int userNum = inKey.nextInt();
		System.out.println("Choose a positive integer");
		int userNum2 = inKey.nextInt();
		//find power of userNum^userNum2
		System.out.println(userNum + "^" + userNum2 + " " + Math.pow(userNum, userNum2));
		
		
	}
	
	
	
	
	public static void problem02() {
		//find user num
		Scanner inKey = new Scanner(System.in);	
		System.out.println("Choose a positive integer");
		int userNum = inKey.nextInt();
		//square root of usernum
		System.out.println("The square root of " + userNum + " is " + Math.sqrt(userNum));
		
		
		
	}

	
	

	public static void problem03() {
		//find 2 num of user
		Scanner inKey = new Scanner(System.in);	
		System.out.println("What is the side A of a right triangle");
		int userNum = inKey.nextInt();
		System.out.println("What is the side B of a rigth triangle ");
		int userNum2 = inKey.nextInt();
		//find Hypotenuse
		System.out.println("Hypotenuse = " + Math.sqrt(Math.pow(userNum, 2)+(Math.pow(userNum2, 2))));
		

	}


	
	
	public static void problem04() {
		//max and min to find
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE; 
		Scanner inKey1 = new Scanner(System.in);
		int userNum = 1;
		boolean not0 = true;
		//checking the max and min of number 
		while (not0){
			System.out.println("Choose a integer, choose 0 when your done");
			userNum = inKey1.nextInt();
			if (userNum == 0) {
				not0=false;
			}
			else {
				if (userNum > max) {
					max = userNum;
				}
				else if (userNum < min) {
					min = userNum;
				}
			}
			
		
		}
		//printing it
		System.out.println(max);
		System.out.println(min + "\n");
	}
	
	
	
	
	
}
