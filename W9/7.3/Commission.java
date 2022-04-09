/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firm;

/**
 *
 * @author User
 */
public class Commission extends Hourly {
    private double totalSales;
    private double tingkatKomisi;
    
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double tingkatKomisi){
        super (eName, eAddress, ePhone, socSecNumber, rate);
        this.tingkatKomisi = tingkatKomisi ;
    }
    
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }
   
    public double pay(){ 
      double payment = super.pay() + tingkatKomisi;
      return payment;
    }
    public String toString() 
   { 
      String result = super.toString(); 
 
      result += "\nTotal Sales : " + totalSales; 
 
      return result; 
   } 
}
