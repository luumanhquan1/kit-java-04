
package buoi6.bai2;

import java.util.ArrayList;
import java.util.Scanner;
public class quanly {
  Scanner sc=new Scanner(System.in);
  ArrayList<suaongnuoc> ongnuoclist;
   ArrayList<nhapviengiaohang> giaohanglist;
    ArrayList<nhanvienxeom> xeomlist;
    
    public quanly() {
        ongnuoclist=new ArrayList<>();
         giaohanglist =new ArrayList<>();
            xeomlist=new ArrayList<>();
           
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
            ongnuoclist.add(tmp);
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
            giaohanglist.add(tmp);
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
            xeomlist.add(tmp);
            System.out.println("ban co muon nhap nuoc kh:");
            chon=sc.nextLine();
        }
    }
    public void xuatnvon(){
        int i=0;
        for(suaongnuoc tmp : ongnuoclist){
            i++;
            System.out.printf("%d .",i);
            tmp.xuat();
        }
    }
    public void xuatnvgh(){
        int i=0;
        for(nhapviengiaohang tmp : giaohanglist){
            i++;
            System.out.printf("%d .",i);
            tmp.xuat();
      }
    }
     public void xuatnvxo(){
        int i=0;
        for(nhanvienxeom tmp : xeomlist){
            i++;
            System.out.printf("%d .",i);
            tmp.xuat();
        }
    }

}
