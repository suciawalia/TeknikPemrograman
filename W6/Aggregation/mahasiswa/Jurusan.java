/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;


class Jurusan {
    private String jurusan;
    private Mahasiswa mhs;
    
    public Jurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    public void setMahasiswa(Mahasiswa mhs){
        this.mhs = mhs;
    }
    
    public Mahasiswa getMahasiswa(){
        return mhs;
    }
    
    public String getJurusan(){
        return jurusan;
    }
}
