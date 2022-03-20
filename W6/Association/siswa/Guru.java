/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siswa;


class Guru {
    private String name, nuptk, nisSiswa;
    public Guru(String name, String nuptk, String nisSiswa){
        this.name = name;
        this.nuptk = nuptk;
        this.nisSiswa = nisSiswa;
    }
    public void infoGuru(){
        System.out.println("Informasi Akademik");
        System.out.println("Nama : " + this.name);
        System.out.println("NUPTK : " + this.nuptk);
        System.out.println("NISN Siswa : " + this.nisSiswa);
    }
    
}
