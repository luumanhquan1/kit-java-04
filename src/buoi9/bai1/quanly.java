
package buoi9.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class quanly {
    Scanner sc=new Scanner(System.in);
    ArrayList<ThuocTinh> danhsach;

    public quanly() {
        danhsach=new ArrayList<>();
    }
    public void nhaptaptri(){
        String chon="";
        while(true){
            if(chon.equalsIgnoreCase("k")){
                break;
            }
            taptri tmp=new taptri();
            tmp.nhap();
            System.out.println("ban co muon nhap nua kh");
            danhsach.add(tmp);
            chon=sc.nextLine();
        }
    }
     public void nhapsach(){
        String chon="";
        while(true){
            if(chon.equalsIgnoreCase("k")){
                break;
            }
            sach tmp=new sach();
            tmp.nhap();
            System.out.println("ban co muon nhap nua kh");
            danhsach.add(tmp);
            chon=sc.nextLine();
        }
    }
     public void xuathet(){
             for(int i=0;i<danhsach.size();i++){
                 danhsach.get(i).xuat();
             }
       
     }
     public void xuattaptri(){
         
     int i=0;
         for(ThuocTinh tmp:danhsach){
             if(danhsach.get(i) instanceof taptri){
             danhsach.get(i).xuat();
             }
             i++;
         }
     }
      public void xuatsach(){
     
     int i=0;
         for(ThuocTinh tmp:danhsach){
             if(danhsach.get(i) instanceof sach){
             danhsach.get(i).xuat();
             }
             i++;
         }
     }
       public void menu(){
          System.out.println("1.nhap tap tri");
           System.out.println("2.nhap sach");
            System.out.println("3.xuat het");
              System.out.println("4.xuat sach");
               System.out.println("5.xuat tap tri");
                System.out.println("6.thoat");
      }
}
