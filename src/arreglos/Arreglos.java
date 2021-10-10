/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Dell
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []ar1={25,67,90,87,12};
        int[]ar2={10,34,90,87,86};
       boolean bandera= DeterminaIgualdad(ar1,ar2);
       if(bandera==false)System.out.println("Los arreglos son diferentes");
       if(bandera==true)System.out.println("Los arreglos son iguales ");
    }
   public static boolean DeterminaIgualdad(int ar1[],int ar2[]) {
       boolean bandera=true;
       if(ar1.length>ar2.length)return false;
       if(ar1.length<ar2.length)return false;
       else{for(int j=0;j<ar1.length;j++){
       
       if(ar1[j]!=ar2[j])break;
       
       
       }}
   return bandera;
   
   
   }
}
