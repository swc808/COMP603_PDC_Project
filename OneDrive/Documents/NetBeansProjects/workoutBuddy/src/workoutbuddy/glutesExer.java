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
public class glutesExer {
    public static void glutesPrompt()
	{
	
		try {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("1) for hip thrust");
		System.out.println("2) for split squats");
		System.out.println("3) for pelvic lift");
		
		int glutesinput = scan.nextInt();
		
		if(glutesinput == 1)
		{
			//line add method
			fileManager.file(35);
			System.out.println("hipthrust added");
			System.out.println("");
			
			
		}
		else if(glutesinput == 2)
		{
			//line add method
			fileManager.file(36);
			System.out.println("split squats row added");
			System.out.println("");
		}
		else if(glutesinput == 3)
		{
			//line add method
			fileManager.file(37);
			System.out.println("pelvic lift added");
			System.out.println("");
		}
		
		
	
	}catch(Exception e){
  		 
  		 System.out.println("invalid input");
  		 
  		 
  	 }

	}
	
    
}
