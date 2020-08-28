package testing;

import java.util.Scanner;

public class If_statement {
 public static void main(String[] str) {
	 
	 Scanner sc =new Scanner (System.in);
	 System.out.print("Enter your marks in percentage:");
	 int marks=sc.nextInt();
	 if(marks<50) {
		 System.out.println(" You are Fail");
	 }
	 else if(marks>=50 && marks<=60) {
		 System.out.println(" You got Second class");
		 
	 }
	 else if(marks>60  && marks<=75) {
		 System.out.println(" You got First Class");
	 }
	 else {
		 System.out.println(" You got destingtion");
	 }
	 
 }
}
