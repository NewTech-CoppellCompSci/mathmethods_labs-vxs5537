package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		//scanner to find launch velocity and angle
		Scanner inKey1 = new Scanner(System.in);
		System.out.print("Enter launch velocity (m/s) >>> ");
		int launchVelocity = inKey1.nextInt();
		System.out.print("Enter launch angle (degrees) >>> ");
		int launchAngle = inKey1.nextInt();
		System.out.println("Projectile's path: ");
		//time int
		int time=0;
		//Position
		double xPos=Math.cos(Math.toRadians(launchAngle)) * time * launchVelocity;
		double yPos=Math.sin(Math.toRadians(launchAngle)) * time * launchVelocity - 0.5 * 9.8 * Math.pow(time, 2);
		boolean launch = true;
		System.out.println("Time: " + time );
		System.out.println("xPos:  " + xPos +" m");
		System.out.println( "yPos:  " + yPos + " m");
		//find launch 
		while (launch) {
			
			//calculate distance and height
			time++;
			xPos=Math.cos(Math.toRadians(launchAngle)) * time * launchVelocity;
			yPos=Math.sin(Math.toRadians(launchAngle)) * time * launchVelocity - 0.5 * 9.8 * Math.pow(time, 2);
			//if negative change yPos to 0
			if (yPos < 0) {
				yPos=0;
			}
			System.out.println("Time: " + time );
			System.out.println("xPos:  " + xPos +" m");
			
			System.out.println( "yPos:  " + yPos + " m");
			//end launch
			if (yPos==0) {
				launch=false;
			}
			
		}
		
		
		
	}
	
	
}
