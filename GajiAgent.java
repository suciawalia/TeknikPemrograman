/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gajiagent;
import java.util.Scanner;
/**
 * Date 19022022
 * @author Suci Awalia Gardara
 */
public class GajiAgent {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Item = in.nextInt();
        int gajiPokok = 500000;
        int bonus1 = (gajiPokok*25)/100;
        int bonus2 = (gajiPokok*35)/100;
        int Gajih, denda;
        int potongan = (15-Item)*50000;
        int bonusperItem = ((Item*50000)*10)/100;
        
        if(Item >=40 && Item <= 80){
            Gajih = gajiPokok + bonus1;
            System.out.println(Gajih);
        }else if(Item>80){
            Gajih = gajiPokok + bonus2;
            System.out.println(Gajih);
        }else if(Item<15){
            denda = (potongan*15)/100;
            Gajih = gajiPokok - denda;
            System.out.println(Gajih);
        }else {
            Gajih = bonusperItem + gajiPokok;
            System.out.println(Gajih);
        }
        }
    
}
