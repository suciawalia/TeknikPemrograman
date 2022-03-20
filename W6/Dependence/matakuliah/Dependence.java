/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matakuliah;

/**
 * @author Suci Awalia Gardara
 * @date 20/03/2022
 */
public class Dependence {
    public static void main(String[] args){
        Dosen dosen = new Dosen("Sobirin");
        MataKuliah mk1 = new MataKuliah("Teknik Pemrogaraman");
        MataKuliah mk2 = new MataKuliah ("Pendidikan Agama Islam");
        MataKuliah mk3 = new MataKuliah ("Bahasa Indonesia");
        
        dosen.tambahMk(mk1);
        dosen.tambahMk(mk2);
        dosen.tambahMk(mk3);
        dosen.printJumlah();
    }
}
