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
public class shoulderExer {
    
    public static void shoulderPrompt()
	{
	
		try {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("1) for military press");
		System.out.println("2) for lateral raises");
		System.out.println("3) for rear delt fly");
		
		int shoulderinput = scan.nextInt();
		
		if(shoulderinput == 1)
		{
			//line add method
			fileManager.file(18);
			System.out.println("military press added");
			System.out.println("");
			
			
		}
		else if(shoulderinput == 2)
		{
			//line add method
			fileManager.file(19);
			System.out.println("lateral raises added");
			System.out.println("");
		}
		else if(shoulderinput == 3)
		{
			//line add method
			fileManager.file(20);
			System.out.println("rear delt fly added");
			System.out.println("");
		}
		
		
	
	}catch(Exception e){
  		 
  		 System.out.println("invalid input");
  		 
  		 
  	 }

	}
	
    
}
