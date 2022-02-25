/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayjava;

/**
 * Date 20022022
 * @author Suci Awalia Gardara
 */
public class ArrayJava {
    
 public static void main(String[] args)
 {
     int i,j,k;
 //One Dimensional Arrays
 int[] fisrtArray = {2, 5, 3};
 int[] secondArray = {9, 5, 3};
 int[] thirdArray = {2, 4, 9};
 int[] fourthArray = {10, 11, 12};
 int[] fifthArray = {13, 14, 15};
 int[] sixthArray = {16, 17, 18};
 int[] seventhArray = {19, 20, 21};
 int[] eighthArray = {22, 23, 24};
 int[] ninthArray = {25, 26, 27};
 //Two Dimensional Arrays
 int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
thirdArray};
 int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
sixthArray};
 int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
ninthArray};
 //Three Dimensional Array
 int[][][] threeDimensionalArray = {twoDimensionalArray1,
twoDimensionalArray2, twoDimensionalArray3};
 for(i=0;i<threeDimensionalArray.length;i++){
     System.out.print("{");
     for(j=0;j<threeDimensionalArray[1].length;j++){
         System.out.print("{");
         for (k=0;k<threeDimensionalArray[0][1].length;k++){
             System.out.print(threeDimensionalArray[i][j][k]+" ");
            }
         System.out.print("}"+" ");
        }
     System.out.print("}");
     System.out.print("\n");
    }
 }
}
