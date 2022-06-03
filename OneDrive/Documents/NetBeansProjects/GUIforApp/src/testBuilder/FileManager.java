/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testBuilder;

import java.io.*;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author swc20
 */
public class FileManager {
    
	public static void file(int lineNum)
	{
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			
			
		
			br = new BufferedReader(new FileReader("./resources/workouts.txt"));
			pw = new PrintWriter(new FileOutputStream("./resources/workoutRoutine.txt",true));
			
			String line = null;
		
		
				for (int i = 1; i < 41; i++)
				{
					
					if(i == lineNum)
					{
						line = br.readLine();
						pw.println(line);

						
					}
					else
					{
						br.readLine();
					}
					
				}
				
				
		} catch(FileNotFoundException ex) {
			Logger.getLogger(WorkoutBuddyMain.class.getName()).log(Level.SEVERE, null, ex);
		} catch(IOException ex) {
			Logger.getLogger(WorkoutBuddyMain.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			
			if(pw != null)
			{
				pw.close();
			}
			if(br != null)
			{
				try {
					br.close();
				} catch(IOException ex) {
					Logger.getLogger(WorkoutBuddyMain.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			
		}
		
		
	}
	
    
}
