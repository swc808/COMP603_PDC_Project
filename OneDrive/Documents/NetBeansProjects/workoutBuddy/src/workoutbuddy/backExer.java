/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workoutbuddy;

import java.util.Scanner;

/**
 *
 * @author swc20
 */
public class backExer {
    
    	public static void backPrompt()
	{
	
		try {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("1) for deadlift");
		System.out.println("2) for barbell row");
		System.out.println("3) for pullup");
		
		int backinput = scan.nextInt();
		
		if(backinput == 1)
		{
			//line add method
			fileManager.file(3);
			System.out.println("deadlift added");
			System.out.println("");
			
			
		}
		else if(backinput == 2)
		{
			//line add method
			fileManager.file(2);
			System.out.println("barbell row added");
			System.out.println("");
		}
		else if(backinput == 3)
		{
			//line add method
			fileManager.file(4);
			System.out.println("pullup added");
			System.out.println("");
		}
		
		
	
	}catch(Exception e){
  		 
  		 System.out.println("invalid input");
  		 
  		 
  	 }

	}
	
    
}
