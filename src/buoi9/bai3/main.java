 
package buoi9.bai3;

import java.util.Scanner;


public class main {
   public static void main(String[] args){
       quanly n1=new quanly();
       int chon;
       Scanner sc=new Scanner(System.in);
       while(true){
           
           n1.Menu();
           chon=sc.nextInt();
           switch(chon){
               case 1:
                   n1.nhapPt();
                   break;
               case 2:
                   n1.timpttheomau();
                   break;
               case 3:
                   return;
                   
           }
       }
   }
    
}
