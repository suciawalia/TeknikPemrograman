/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;
import java.util.Scanner;
/**
 * Program ini untuk menentukan suatu angka termasuk pada type data yang terdiri dari byte, short, int, long.
 * @author Suci
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        double numb = input.nextDouble(); 
        
        if (numb <= Byte.MAX_VALUE && numb >= Byte.MIN_VALUE){
            System.out.println((long)numb + " can be fitted in:\n" + "*byte\n" + "*short\n" + "*int\n" + "*long");
        }
        else if(numb <= Short.MAX_VALUE && numb >= Short.MIN_VALUE){
            System.out.println((long)numb + " can be fitted in:\n" + "*short\n" + "*int\n" + "*long");
        }
        else if(numb <= Integer.MAX_VALUE && numb >= Integer.MIN_VALUE){
            System.out.println((long)numb + " can be fitted in:\n" + "*int\n" + "*long");
        }
        else if(numb <= Long.MAX_VALUE && numb >= Long.MIN_VALUE){
            System.out.println((long)numb + " can be fitted in:\n" + "*long");
        }
        else {
            System.out.println((double)numb + " can't be fitted ");
        }
        
    }
    
}