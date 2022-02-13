/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal6;
import java.util.Scanner;
/**
 * program ini untuk menggabungkan dua buah string serta ukuran dari dua buah string.
 * @author X1 Carbon
 */
public class Soal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String kalimat1 = input.nextLine();
        String kalimat2 = input.nextLine();
        String klm1 = kalimat1.substring(0,1).toUpperCase() + kalimat1.substring(1);
        String klm2 = kalimat2.substring(0,1).toUpperCase() + kalimat2.substring(1);
       
        int size1 = kalimat1.length();
        int size2 = kalimat2.length();
        
        System.out.println(size1 + size2);
        
        if(kalimat1.compareToIgnoreCase(kalimat2)>=0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
        System.out.println(klm1 + " " + klm2);
        
        
        
        
        
    }
    
}
