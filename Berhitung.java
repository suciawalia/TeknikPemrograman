/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package berhitung;
import java.util.Scanner;
/**
 * Date 19022022
 * @author Suci Awalia Gardara
 */
public class Berhitung {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberA = in.nextInt();
        char operator = in.next().charAt(0);
        int numberB = in.nextInt();
        
        if((numberA>=1 && numberA<=1000) && (numberB>=1 && numberB<=1000)){
            if(operator=='+'){
                System.out.println(numberA+numberB);
            }else if(operator=='-'){
                System.out.println(numberA-numberB);
            }else if(operator=='*'){
                System.out.println(numberA*numberB);
            }else if(operator == '/'){
                System.out.println(numberA/numberB);
            }else if(operator=='%'){
                System.out.println(numberA%numberB);
            }
            
        }
        
    }
    
}
