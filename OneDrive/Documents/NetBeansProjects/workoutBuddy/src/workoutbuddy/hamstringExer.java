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
public class hamstringExer {
    public static void hamstringPrompt()
	{
	
		try {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("1) for romanian deadlift");
		System.out.println("2) for leg curl");
		System.out.println("3) for hamstring negatives");
		
		int hamstringinput = scan.nextInt();
		
		if(hamstringinput == 1)
		{
			//line add method
			fileManager.file(27);
			System.out.println("romanian deadlift added");
			System.out.println("");
			
			
		}
		else if(hamstringinput == 2)
		{
			//line add method
			fileManager.file(28);
			System.out.println("leg curl added");
			System.out.println("");
		}
		else if(hamstringinput == 3)
		{
			//line add method
			fileManager.file(29);
			System.out.println("hamstring negatives added");
			System.out.println("");
		}
		
		
	
	}catch(Exception e){
  		 
  		 System.out.println("invalid input");
  		 
  		 
  	 }

	}
    
}
