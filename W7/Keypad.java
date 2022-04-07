/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;
import java.util.Scanner;
/**
 *
 * @author Suci Awalia Gardara
 */


// Keypad.java
// Represents the keypad of the ATM
 
public class Keypad
{
    private Scanner input;
   
    public Keypad()
    {
        input = new Scanner( System.in );
    }
   
    public int getInput()
    {
        return input.nextInt();
    }
   
}