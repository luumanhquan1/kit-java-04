
package buoi8;

import java.util.Scanner;
import java.util.ArrayList;

public class quanly extends thongtin {
Scanner sc=new Scanner(System.in);
   ArrayList<thongtin> danhsachsinhvien;
    public quanly() {
        danhsachsinhvien=new ArrayList<>();
    }
    public void nhapnhanvienongnuoc(){
        int i=1;
        String chon="";
        while(true){
            if(chon.equalsIgnoreCase("k")){
        break;        
            }
            ++i;
        nhanviensuaongnuoc tmp=new nhanviensuaongnuoc();
            System.out.println("nhan vien thu "+i);
        tmp.nhap();
        danhsachsinhvien.add(tmp);
            System.out.println("ban co muon nhap nua kh");
            chon=sc.nextLine();
    }
    }
    public void nhapnhanviengiaohang(){
        int i=1;
        String chon="";
        while(true){
            if(chon.equalsIgnoreCase("k")){
                break;
            }
            
            nhanviengiaohang tmp=new nhanviengiaohang();
            System.out.println("nhap nhan vien thu "+ ++i);
            tmp.nhap();
            danhsachsinhvien.add(tmp);
            System.out.println("ban co muon nhap nua kh");
            chon=sc.nextLine();
        }
    }
     public void nhapnhanviensuaongnuoc(){
        int i=1;
        String chon="";
        while(true){
            if(chon.equalsIgnoreCase("k")){
                break;
            }
            ++i;
            nhanviensuaongnuoc tmp=new nhanviensuaongnuoc();
            System.out.println("nhap nhan vien thu "+i);
            tmp.nhap();
            danhsachsinhvien.add(tmp);
            System.out.println("ban co muon nhap nua kh");
            chon=sc.nextLine();
        }
    }
     public void nhapnhanvienxeom(){
        int i=1;
        String chon="";
        while(true){
            if(chon.equalsIgnoreCase("k")){
                break;
            }
            ++i;
            nhanvienxeom tmp=new nhanvienxeom();
            System.out.println("nhap nhan vien thu "+i);
            tmp.nhap();
            danhsachsinhvien.add(tmp);
            System.out.println("ban co muon nhap nua kh");
            chon=sc.nextLine();
        }
    }
  
    public void xuatnhanvienxeom(){
        int i=0;
        for(thongtin tmp : danhsachsinhvien){
            
            if(danhsachsinhvien.get(i) instanceof nhanvienxeom){
                
               danhsachsinhvien.get(i).xuat();
            }
            i++;
        }
    }
     public void xuatnhanviengiaohang(){
        int i=0;
        for(thongtin tmp : danhsachsinhvien){
            
            if(danhsachsinhvien.get(i) instanceof nhanviengiaohang){
                
                danhsachsinhvien.get(i).xuat();
            }
            i++;
        }
        
    }
      public void xuatnhanviensuaongnuoc(){
        int i=0;
        for(thongtin tmp : danhsachsinhvien){
            
            if(danhsachsinhvien.get(i) instanceof nhanviensuaongnuoc){
                
               danhsachsinhvien.get(i).xuat();
            }
            i++;
        }
        
    }
      public void xuatnv(){
          int i=0;
          for(thongtin tmp:danhsachsinhvien){
              
             danhsachsinhvien.get(i).xuat();
             i++;
          }
      }
      
      public void sapxep(){
          for(int i=0;i<danhsachsinhvien.size()-1;i++){
              for(int j=i+1;j<danhsachsinhvien.size();j++){
                  if(danhsachsinhvien.get(i).tinhtien() < danhsachsinhvien.get(j).tinhtien()){
                     thongtin tmp;
                     tmp=danhsachsinhvien.get(i);
                     danhsachsinhvien.set(i,danhsachsinhvien.get(j));
                     danhsachsinhvien.set(j, tmp);
                  }
              }
          }
      }
      public void sapxepluonggiamdan(){
          sapxep();
          for(thongtin tmp:danhsachsinhvien){
              tmp.xuat();
          }
      }
      public void menu(){
          System.out.println("1.nhap nhan vien xe om");
           System.out.println("2.nhap nhan vien giao hang");
            System.out.println("3.nhap nhan vien sua ong nuoc");
             System.out.println("4.xuat nhan vien xe om");
              System.out.println("5.xuat nhan vien xe giao hang");
               System.out.println("6.xuat nhan vien xe sua ong nuoc");
                System.out.println("7.xuat nhan vien ");
                System.out.println("8.Thong ke luong");
                System.out.println("9.thoat");
      }
}
