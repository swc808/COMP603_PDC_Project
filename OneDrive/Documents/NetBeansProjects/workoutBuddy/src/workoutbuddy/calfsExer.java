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
public class calfsExer {public static void calfsPrompt()
	{
	
		try {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("1) for standing calf raises");
		System.out.println("2) for sitting calf raises");
		System.out.println("3) for single calf raises");
		
		int calfsinput = scan.nextInt();
		
		if(calfsinput == 1)
		{
			//line add method
			fileManager.file(31);
			System.out.println("standing calf raises added");
			System.out.println("");
			
			
		}
		else if(calfsinput == 2)
		{
			//line add method
			fileManager.file(32);
			System.out.println("sitting calf raises added");
			System.out.println("");
		}
		else if(calfsinput == 3)
		{
			//line add method
			fileManager.file(33);
			System.out.println("single calf raises added");
			System.out.println("");
		}
		
		
	
	}catch(Exception e){
  		 
  		 System.out.println("invalid input");
  		 
  		 
  	 }

	}
	
    
}
