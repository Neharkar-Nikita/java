package testing;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Weight in kg:");
     float weight=sc.nextFloat();
    
     System.out.println("Enter Height in cen:");
     float height=sc.nextFloat();
     
     float BMI_cal=weight/(height*height);
     System.out.println("\n body of mass is" + BMI_cal+ "kg/m2");
     
     if(BMI_cal<18.5)
     {
    	 System.out.println("under weight");

     
	}
     else if(BMI_cal>18.5 &&BMI_cal<24.9)
     {
    	 System.out.println("normal");
     }
     else if(BMI_cal>25.0 &&BMI_cal<29.9)
     {
    	 System.out.println("Overweight");
     }
     else
     {
    	 System.out.println("obesity");
     }
	}

	}
