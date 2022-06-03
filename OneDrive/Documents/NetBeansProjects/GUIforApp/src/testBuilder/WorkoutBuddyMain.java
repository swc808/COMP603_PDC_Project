/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testBuilder;

/**
 *
 * @author swc20
 */
public class WorkoutBuddyMain
{
    public static void main(String[]args)
    {
        
        DBManager dbManager = new DBManager();
        dbManager.establishConnection();
        
        System.out.println(dbManager.getConnection());
        User use = new User();
        IntroFrame testin = new IntroFrame();
        testin.setVisible(true);
       
 
        
        
    }
    
}
