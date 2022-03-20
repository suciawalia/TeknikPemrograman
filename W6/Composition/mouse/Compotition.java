/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mouse;

/**
 * @author Suci Awalia Gardara
 * @date 20/03/2022
 */
public class Compotition {
   public static void main(String[] args){
       
       //komposisi
       Computer computer = new Computer();
       computer.setMerk("MSI");
       computer.setMouse("Track Ball","Wireless");
       
       System.out.println("Merk Computer : "+computer.getMerk());
       System.out.println("Jenis Mouse   : "+computer.getJenisMouse());
       System.out.println("Model Moude   : "+computer.getModelmoude());
   }
}
