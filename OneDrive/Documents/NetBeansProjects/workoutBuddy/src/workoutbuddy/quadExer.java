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
public class quadExer {
    public static void quadPrompt()
	{
	
		try {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("1) for squat");
		System.out.println("2) for leg extension");
		System.out.println("3) for goblet squat");
		
		int quadinput = scan.nextInt();
		
		if(quadinput == 1)
		{
			//line add method
			fileManager.file(23);
			System.out.println("squat added");
			System.out.println("");
			
			
		}
		else if(quadinput == 2)
		{
			//line add method
			fileManager.file(24);
			System.out.println("leg extension added");
			System.out.println("");
		}
		else if(quadinput == 3)
		{
			//line add method
			fileManager.file(25);
			System.out.println("goblet added");
			System.out.println("");
		}
		
		
	}catch(Exception e){
  		 
  		 System.out.println("invalid input");
  		 
  		 
  	 }

	}
    
}
