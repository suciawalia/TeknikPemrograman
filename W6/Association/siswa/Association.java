/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siswa;



public class Association {
    public static void main (String[] args){
        Siswa raya = new Siswa("Raya Muhammad", "1990876");
        Guru sobirin = new Guru("Sobirin Muhammad", "0098754321", raya.getNoInduk()); 
        sobirin.infoGuru();
    }
    
}
