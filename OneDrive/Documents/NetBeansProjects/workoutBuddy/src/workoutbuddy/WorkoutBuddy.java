/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workoutbuddy;

import java.util.Scanner;

/**
 *
 * @author swc20
 */
public class WorkoutBuddy {

  public static void main(String []args)

    {
   	 Scanner scan = new Scanner(System.in);

   	 System.out.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\");
   	 System.out.println(" workout buddy ");
   	 System.out.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\");
   	 
   	 System.out.println("");
   	 
   	 System.out.println("This program will give you excercises based on the muscles you choose.");
   	 System.out.println("you can add a maximum of 10 excercises");
   	 System.out.println("you will be given a file with all the chosen excercises");
   	 System.out.println("your file can be found in the resources folder of this program");
   	 System.out.println("you can press |q| to save an quit the program ay any time");
   	 
   	 System.out.println("");
   	 

   	for (int i = 0; i < 10; i++) 
   	{		
   		
   	 try {
   		 
   		 System.out.println("Would you like upper body or lower body exercises?");
   	   	 System.out.println("press 1) for upper body 2) for lower body");
   	 
   		 
   	 	 int userinput = scan.nextInt();
  
   		 if(userinput == 1)
	   	 	 {
	   	 		 System.out.println("upper method");
	   	 		
	   	 		 upperBody.upperPrompt();
	   	 		 
	   	 	 }
	   	 	 else if(userinput == 2)
	   	 	 {
	   	 		 System.out.println("lower method");
	   	 		 
	   	 		 lowerBody.lowerPrompt();
	   	 		
	   	 		 
	   	 	 }
	   	 	 else if(userinput != 1 || userinput != 2) 
	   	 	 {
		   	 	 while(userinput != 1 && userinput != 2)
		   	 	 {

		   	 		     System.out.println("please enter either 1 or 2");
		   	 		 
		                 System.out.println("enter 1 for upper body or 2 for lower body");
		   	 		 
		   	 		     System.out.println("1) upper 2) lower");
		   	 		    
		   	 		     userinput = scan.nextInt();
		
			   	 		 if(userinput == 1)
				   	 	 {
				   	 		 System.out.println("upper method");
				   	 		 
				   	 		 upperBody.upperPrompt();
				   	 		 
				   	 		 
				   	 	 }
				   	 	 else if(userinput == 2)
				   	 	 {
				   	 		 System.out.println("lower method");
				   	 		 
				   	 	     lowerBody.lowerPrompt();
				   	 		 
		   	 	         }
	   	 		 
   	 	        }
		 
   	 	 	
   	 	   }
 
   	 	 
   	 }catch(Exception e){
   		 
   		 System.out.println("invalid input");
   		 
   		 
   	 }
   	
   	 
    }
    

    
}
    
    
    
    
}
