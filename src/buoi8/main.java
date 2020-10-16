
package buoi8;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        quanly n1=new quanly();
     
      int i=0;
      
      while(true){
           n1.menu();
          i=sc.nextInt();
      switch(i){
          case 1:
              n1.nhapnhanvienxeom();
              break;
               case 2:
                   n1.nhapnhanviengiaohang();
              break;
               case 3:
                   n1.nhapnhanvienongnuoc();
              break;
               case 4:
                   n1.xuatnhanvienxeom();
              break;
               case 5:
                   n1.xuatnhanviengiaohang();
              break;
               case 6:
                   n1.xuatnhanviensuaongnuoc();
              break;
               case 7:
                   n1.xuatnv();
              break;
               case 8:
                   n1.sapxepluonggiamdan();
               break;
               case 9:
                   return;
      }
      
      }
    }
}
