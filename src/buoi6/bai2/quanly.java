
package buoi6.bai2;
import java.util.ArrayList;
import java.util.Scanner;
public class quanly extends thongtin {
  Scanner sc=new Scanner(System.in);
ArrayList<thongtin> danhsachsinhvien;
    public quanly() {
           danhsachsinhvien=new ArrayList<>();
    }
    public void nhapnvon(){
        int i=1;
        String chon="";
        while(true){
            suaongnuoc tmp= new suaongnuoc();
            if(chon.equalsIgnoreCase("k")){
                break;
            }
            tmp.nhap();
            danhsachsinhvien.add(tmp);
            System.out.println("ban co muon nhap nuoc kh:");
            chon=sc.nextLine();
        }
    }
    public void nhapnvgh(){
        int i=1;
        String chon="";
        while(true){
            nhapviengiaohang tmp= new nhapviengiaohang();
            if(chon.equalsIgnoreCase("k")){
                break;
            }
            tmp.nhap();
            danhsachsinhvien.add(tmp);
            System.out.println("ban co muon nhap nuoc kh:");
            chon=sc.nextLine();
        }
    }
    public void nhapnvxo(){
        int i=1;
        String chon="";
        while(true){
            nhanvienxeom tmp= new nhanvienxeom();
            if(chon.equalsIgnoreCase("k")){
                break;
            }
            tmp.nhap();
            danhsachsinhvien.add(tmp);
            System.out.println("ban co muon nhap nuoc kh:");
            chon=sc.nextLine();
        }
    }
    public void xuatnvon(){
        int i=0;
        for(thongtin tmp : danhsachsinhvien){
            if(danhsachsinhvien.get(i) instanceof suaongnuoc ){
            i++;
            System.out.printf("%d .",i);
            tmp.xuat();}
        }
    }
    public void xuatnvgh(){
        int i=0;
        for(thongtin tmp : danhsachsinhvien){
            if(danhsachsinhvien.get(i) instanceof nhapviengiaohang){
            i++;
            System.out.printf("%d .",i);
            tmp.xuat();}
      }
    }
     public void xuatnvxo(){
        int i=0;
        for(thongtin tmp : danhsachsinhvien){
            if(danhsachsinhvien.get(i) instanceof nhanvienxeom){
            i++;
            System.out.printf("%d .",i);
            tmp.xuat();}
        }
    }
     public void xuatnv(){
         int i=0;
         for(thongtin tmp : danhsachsinhvien){
             i++;
             tmp.xuat();
         }
     }

}
