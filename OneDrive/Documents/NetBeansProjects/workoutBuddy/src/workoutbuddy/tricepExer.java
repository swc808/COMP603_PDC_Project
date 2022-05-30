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
public class tricepExer {
    public static void tricepPrompt()
	{
	
		try {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("1) for skull crushers");
		System.out.println("2) for rope pull down");
		System.out.println("3) for close grip bench press");
		
		int tricepinput = scan.nextInt();
		
		if(tricepinput == 1)
		{
			//line add method
			fileManager.file(14);
			System.out.println("skull crushers added");
			System.out.println("");
			
			
		}
		else if(tricepinput == 2)
		{
			//line add method
			fileManager.file(15);
			System.out.println("rope pull down added");
			System.out.println("");
		}
		else if(tricepinput == 3)
		{
			//line add method
			fileManager.file(16);
			System.out.println("close grip bench press added");
			System.out.println("");
		}
		
		
	
	}catch(Exception e){
  		 
  		 System.out.println("invalid input");
  		 
  		 
  	 }

	}
    
}
