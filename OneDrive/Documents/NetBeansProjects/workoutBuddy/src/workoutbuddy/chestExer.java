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
public class chestExer {
    
    public static void chestPrompt()
	{
	
		try {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("1) for bench press");
		System.out.println("2) for chest fly");
		System.out.println("3) for incline bench");
		
		int chestinput = scan.nextInt();
		
		if(chestinput == 1)
		{
			//line add method
			fileManager.file(6);
			System.out.println("bench press added");
			System.out.println("");
			
			
		}
		else if(chestinput == 2)
		{
			//line add method
			fileManager.file(7);
			System.out.println("chest fly added");
			System.out.println("");
		}
		else if(chestinput == 3)
		{
			//line add method
			fileManager.file(8);
			System.out.println("incline bench added");
			System.out.println("");
		}
		

	}catch(Exception e){
  		 
  		 System.out.println("invalid input");
  		 
  		 
  	 }

	}
    
}
