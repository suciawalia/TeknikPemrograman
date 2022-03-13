/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author X1 Carbon
 */
public class RestaurantMain {
    public static void main(String[] args){
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tampilMenuMakanan();
        menu.penguranganStok(20);
        menu.tampilMenuMakanan();
        System.out.println("\n");
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tampilMenuMakanan();
        menu.penguranganStok(20);
        menu.tampilMenuMakanan();
        System.out.println("\n");
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        menu.penguranganStok(20);
        System.out.println("\n");
        
        menu.tampilMenuMakanan();
    }
    
}
