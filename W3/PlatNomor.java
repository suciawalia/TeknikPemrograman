/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package platnomor;
import java.util.Scanner;

/**
 * Date 19022022
 * @author Suci Awalia Gardara
 */
public class PlatNomor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String mobil1 = in.next();
        String mobil2 = in.next();
        String mobil3 = in.next();
        String mobil4 = in.next();
        
        String total = mobil1 + mobil2 + mobil3 + mobil4;
        
        Long a = Long.valueOf(total);
        
        Long result =(a-999999)%5;
        
        if(result == 0){
            System.out.println("jalan");
        }else{
            System.out.println("berhenti");
        }
    }
    
}
