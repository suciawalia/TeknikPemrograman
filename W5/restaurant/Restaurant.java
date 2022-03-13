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
public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;
    
    
    public String[] getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String[] nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public double[] getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(double[] harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public int[] getStok() {
        return stok;
    }

    public void setStok(int[] stok) {
        this.stok = stok;
    }

    
    
    //inisialisasi object
    {
        byte id = 0;
        double harga_makanan=0;
        String nama_makanan = "";   
    }
    
    public Restaurant(){
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
        
    }
    
    
    public void tampilMenuMakanan(){
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"-----"+"Rp. "+harga_makanan[i]);
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
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
        this.stok[id] = stok-number;
    }
}
