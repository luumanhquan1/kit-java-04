/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9.bai1;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class main {
    public static void main(String[] args){
        quanly n1=new quanly();
           Scanner sc=new Scanner(System.in);  
      int i=0;   
      while(true){
           n1.menu();
          i=sc.nextInt();
      switch(i){
          case 1:
              n1.nhaptaptri();
              break;
               case 2:
                   n1.nhapsach();
              break;
               case 3:
                  n1.xuathet();
              break;
               case 4:
                 n1.xuatsach();
              break;
               case 5:
                   n1.xuattaptri();
              break;
               case 6:
                   return;
              
      }
      
      }
    }
    }

