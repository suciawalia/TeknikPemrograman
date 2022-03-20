/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 * @author Suci Awalia Gardara
 * @date 20/03/2022
 */
public class Aggregation {
    public static void main (String[] args){
        Mahasiswa mhs = new Mahasiswa ("Suci", "211524027");
        Jurusan jurusan = new Jurusan("Teknik Informatika");
        
        jurusan.setMahasiswa(mhs);
        
        System.out.println("Nama Mahasiswa : " + jurusan.getMahasiswa().getNama());
        System.out.println("NIM Mahasiswa  : " + jurusan.getMahasiswa().getNim());
        System.out.println("Jurusan        : " + jurusan.getJurusan());
    }
}
