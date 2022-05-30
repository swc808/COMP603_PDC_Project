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
public class hipsExer {
    public static void hipsPrompt()
	{
	
		try {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("1) for jack knife");
		System.out.println("2) for resistance band extension");
		System.out.println("3) for hanging leg raises");
		
		int hipsinput = scan.nextInt();
		
		if(hipsinput == 1)
		{
			//line add method
			fileManager.file(39);
			System.out.println("jack knife added");
			System.out.println("");
			
			
		}
		else if(hipsinput == 2)
		{
			//line add method
			fileManager.file(40);
			System.out.println("resistance band extension added");
			System.out.println("");
		}
		else if(hipsinput == 3)
		{
			//line add method
			fileManager.file(41);
			System.out.println("hanging leg raises added");
			System.out.println("");
		}
		
		
	
	}catch(Exception e){
  		 
  		 System.out.println("invalid input");
  		 
  		 
  	 }

	}
    
}
