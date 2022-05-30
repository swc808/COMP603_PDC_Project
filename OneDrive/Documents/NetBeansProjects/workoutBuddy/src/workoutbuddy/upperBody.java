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
public class upperBody {
    
    
    public static void upperPrompt()
	{
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("please select a muscle");
		System.out.println("1) back");
		System.out.println("2) chest");
		System.out.println("3) bicep");
		System.out.println("4) tricep");
		System.out.println("5) shoulder");
		
		 try {
	   		 

			 	 int upperinput = scan.nextInt();
	   	 	 
	   		     if(upperinput == 1)
		   	 	 {
		   	 		 System.out.println("please select specific BACK exercise");
		   	 		 backExer.backPrompt();
		   	
		   	 	 }
		   	 	 else if(upperinput == 2)
		   	 	 {
		   	 		 System.out.println("please select specific CHEST exercise");
		   	 		 chestExer.chestPrompt();
		   	 		 
		   	 	 }
		   	 	 else if(upperinput == 3)
		   	 	 {
		   	 		System.out.println("please select specific BICEP exercise");
		   	 		bicepExer.bicepPrompt();
		   	 		
		   	 	 }
		   	 	 else if(upperinput == 4)
		   	 	 {
		   	 		System.out.println("please select specific TRICEP exercise");
		   	 		tricepExer.tricepPrompt();
		   	 		
		   	 	 }
		   	 	 else if(upperinput== 5)
		   	 	 {
		   	 		System.out.println("please select specific SHOULDER muscle exercise");
		   	 		shoulderExer.shoulderPrompt();
		   	 		
		   	 	 }
	   		 
	   		 
		   	 	 else if(upperinput != 1 || upperinput != 2 || upperinput != 3 || upperinput != 4 || upperinput != 5) 
		   	 	 {
			   	 	 while(upperinput != 1 && upperinput != 2 && upperinput != 3 && upperinput != 4 && upperinput!= 5)
			   	 	 {

			   	 		     System.out.println("please enter number between 1 and 5");
			   	 		 
			                 System.out.println("1) back 2) chest 3) bicep 4) tricep  5) shouler");
			                 
			                 upperinput = scan.nextInt();
			   	 	
			                 if(upperinput == 1)
					   	 	 {
					   	 		 System.out.println("please select specific BACK exercise");
					   	 
					   	 		 
					   	 	 }
					   	 	 else if(upperinput == 2)
					   	 	 {
					   	 		 System.out.println("please select specific CHEST exercise");
					   	 		 
					   	 	 }
					   	 	 else if(upperinput == 3)
					   	 	 {
					   	 		System.out.println("please select specific BICEP exercise");
					   	 		
					   	 	 }
					   	 	 else if(upperinput == 4)
					   	 	 {
					   	 		System.out.println("please select specific TRICEP exercise");
					   	 		
					   	 	 }
					   	 	 else if(upperinput == 5)
					   	 	 {
					   	 		System.out.println("please select specific SHOULDER muscle exercise");
					   	 		
					   	 	 }
	   	 	        }
	   	 		     
	   	 	 	
	   	 	   }
	 
	   	 	 
	   	 }catch(Exception e){
	   		 
	   		 System.out.println("invalid input");
	   		 
	   		 
	   	 }
	   	
	   	 
	    }
    
    
}
