/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author User
 */
public class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    
    public static void main(String[] args){
        Animal obj = new Horse();
        obj.sound();
    }
}
