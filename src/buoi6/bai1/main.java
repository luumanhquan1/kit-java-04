
package buoi6.bai1;

import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        quanlydanhsach quanly=new quanlydanhsach();
        int i;
       while(true){
           quanly.menu();
           System.out.println("mời bạn chọn chức năng:");
           i=sc.nextInt();
          switch(i){
              case 1:
                  quanly.nhapnguoilon();
                  break;
              case 2:
                  quanly.nhaptreem();
                  break;
              case 3:
                  quanly.xuatnguoilon();
                  break;
              case 4:
                  quanly.xuattreem();
                  break;
              case 5: 
                  return;
          }           
       }
    }
}
