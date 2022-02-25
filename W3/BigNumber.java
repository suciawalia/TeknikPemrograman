/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bignumber;
import java.util.*;
import java.math.*;
/**
 * Date 19022022
 * @author Suci Awalia Gardara
 */
public class BigNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
    }
    
}
