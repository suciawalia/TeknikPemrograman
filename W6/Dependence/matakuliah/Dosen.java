/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matakuliah;


class Dosen {
    String nama;
    MataKuliah mk[];
    private int jmlh;
    
    public Dosen(String n){
        nama = n;
        mk = new MataKuliah[3];
        this.jmlh=0;
    }
    
    public void tambahMk(MataKuliah MK){
        mk[jmlh]=MK;
        jmlh++;
    }
    
    public void printJumlah(){
        System.out.println(nama);
        for (int i = 0; i<jmlh;i++){
            mk[i].printMataKuliah();
        }
    }
}
