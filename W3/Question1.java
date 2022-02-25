/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question1;
import java.util.Scanner;
/**
 * Date 18022022
 * @author Suci Awalia Gardara
 */
public class Question1 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();
        
        String[] word = (kata.replaceAll("^[\\W+\\s+]", " ").split("[\\s!,?._'@]+"));
        System.out.println(word.length);
        for( String result : word){
            System.out.println(result);
        }       
    }
    
}
