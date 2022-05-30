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
public class bicepExer {
	
	public static void bicepPrompt()
	{
	
		try {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("1) for hammer curls");
		System.out.println("2) for bicep curls");
		System.out.println("3) for preacher curls");
		
		int bicepinput = scan.nextInt();
		
		if(bicepinput == 1)
		{
			//line add method
			fileManager.file(10);
			System.out.println("hammer curls added");
			System.out.println("");
			
			
		}
		else if(bicepinput == 2)
		{
			//line add method
			fileManager.file(11);
			System.out.println("bicep curls added");
			System.out.println("");
		}
		else if(bicepinput == 3)
		{
			//line add method
			fileManager.file(12);
			System.out.println("preacher curls added");
			System.out.println("");
		}
		
		
	
	}catch(Exception e){
  		 
  		 System.out.println("invalid input");
  		 
  		 
  	 }

	}
	
}