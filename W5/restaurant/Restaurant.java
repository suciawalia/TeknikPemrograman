/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;

import java.util.Scanner;

/**
 * @date 13/03/2022
 * @author Suci Awalia Gardara
 */
public class Restaurant extends Rest{
    private Rest[] field;
    private static byte id=0;
    
    
    public Restaurant(){
        field = new Rest[10];
        for(int i =0; i<10; i++){
            field[i]=new Rest();
        }
    }
    
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.field[id].setNama_makanan(nama);
        this.field[id].setHarga_makanan(harga);
        this.field[id].setStok(stok);
        
    }
    
    
    public void tampilMenuMakanan(){
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                System.out.println(this.field[i].getNama_makanan() +"["+this.field[i].getStok()+"]"+"-----"+"Rp. "+this.field[i].getHarga_makanan());
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(this.field[id].getStok()==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
    
    public void penguranganStok(int stok){
        Scanner in = new Scanner(System.in);
        System.out.print("Kurangi stok: ");
        int number = in.nextInt();
        this.field[id].setStok(stok-number);
    }
}
