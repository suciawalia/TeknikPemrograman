/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barang;

/**
 * @author Suci Awalia Gardara
 * @date 25/02/2022
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stock;
    
    //constructor
    public Barang (String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stock = stk+20;
    }
    
    
    public int getStock(){
        return this.stock;
    }
    
    public void setStock(){
        this.stock=stock;
    }
    
    
}
