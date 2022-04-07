/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author Suci Awalia Gardara
 */


// Screen.java
// Represents the screen of the ATM

public class Screen
{
    public void displayMessage( String message )
    {
        System.out.print( message );
    }
   
    public void displayMessageLine( String message )
    {
        System.out.println( message );
    }
   
    public void displayDollarAmount( double amount )
    {
        System.out.printf( "$%,.2f", amount );
    }
   
}