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
public class lowerBody {
    
    
    public static void lowerPrompt()
	{
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("please select a muscle");
		System.out.println("1) quad");
		System.out.println("2) hamstring");
		System.out.println("3) calfs");
		System.out.println("4) glutes");
		System.out.println("5) hips");
		
 try {
	   		 
	   	 	 	int lowerinput = scan.nextInt();
	   	 	 
	   		     if(lowerinput == 1)
		   	 	 {
		   	 		 System.out.println("please select specific QUAD exercise");
		   	 		 quadExer.quadPrompt();
		   	 
		   	 		 
		   	 	 }
		   	 	 else if(lowerinput == 2)
		   	 	 {
		   	 		 System.out.println("please select specific HAMSTRING exercise");
		   	 		 hamstringExer.hamstringPrompt();
		   	 		 
		   	 	 }
		   	 	 else if(lowerinput == 3)
		   	 	 {
		   	 		System.out.println("please select specific CALFS exercise");
		   	 		calfsExer.calfsPrompt();
		   	 		
		   	 	 }
		   	 	 else if(lowerinput == 4)
		   	 	 {
		   	 		System.out.println("please select specific GLUTE exercise");
		   	 		glutesExer.glutesPrompt();
		   	 		
		   	 	 }
		   	 	 else if(lowerinput == 5)
		   	 	 {
		   	 		System.out.println("please select specific HIPS exercise");
		   	 		hipsExer.hipsPrompt();
		   	 		
		   	 	 }
	   		 
	   		 
		   	 	 else if(lowerinput != 1 || lowerinput != 2 || lowerinput != 3 || lowerinput != 4 || lowerinput!= 5) 
		   	 	 {
			   	 	 while(lowerinput != 1 && lowerinput != 2 && lowerinput != 3 && lowerinput != 4 && lowerinput!= 5)
			   	 	 {

			   	 		     System.out.println("please enter number between 1 and 5");
			   	 		 
			                 System.out.println("1) back 2) chest 3) bicep 4) tricep  5) shouler");
			                 
			                 lowerinput = scan.nextInt();
			                 
			    	   	 	 
				   		     if(lowerinput == 1)
					   	 	 {
					   	 		 System.out.println("please select specific QUAD exercise");
					   	 
					   	 		 
					   	 	 }
					   	 	 else if(lowerinput == 2)
					   	 	 {
					   	 		 System.out.println("please select specific HAMSTRING exercise");
					   	 		 
					   	 	 }
					   	 	 else if(lowerinput == 3)
					   	 	 {
					   	 		System.out.println("please select specific CALFS exercise");
					   	 		
					   	 	 }
					   	 	 else if(lowerinput == 4)
					   	 	 {
					   	 		System.out.println("please select specific GLUTE exercise");
					   	 		
					   	 	 }
					   	 	 else if(lowerinput == 5)
					   	 	 {
					   	 		System.out.println("please select specific HIPS exercise");
					   	 		
					   	 	 }
				   		 
			   	 	
			               
	   	 	        }
	   	 		     
	   	 	 	
	   	 	   }
	 
	   	 	 
	   	 }catch(Exception e){
	   		 
	   		 System.out.println("invalid input");
	   		 
	   		 
	   	 }
	   	
	   	 
	    }
    
}
