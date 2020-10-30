
package buoi9.bai3;

import java.util.ArrayList;
import java.util.Scanner;


public class quanly  {

    public quanly() {
    }

    ArrayList<PTGT> PhuongTienGt=new ArrayList<>();
    public void nhapPt(){
        Scanner sc=new Scanner(System.in);
        String chon="";
        System.out.println("nhap phuong tien can dang ki(oto/xetai/xemay)");
        chon=sc.nextLine();
         int n=0;
        switch(chon){
            case "oto":
               
                System.out.println("nhap so phuong tien can dang ki");
                n=sc.nextInt();
                for(int i=1;i<=n;i++){
                   oto tmp=new oto();
                   tmp.nhap();
                   PhuongTienGt.add(tmp);
                }
                break;
                case "xetai":
                System.out.println("nhap so phuong tien can dang ki");
                n=sc.nextInt();
                for(int i=1;i<=n;i++){
                   trongtai tmp=new trongtai();
                   tmp.nhap();
                   PhuongTienGt.add(tmp);
                }
                break;
                case "xemay":
                     System.out.println("nhap so phuong tien can dang ki");
                n=sc.nextInt();
                for(int i=1;i<=n;i++){
                   xemay tmp=new xemay();
                   tmp.nhap();
                   PhuongTienGt.add(tmp);
                }
                break;
        }
    }
    public void timpttheomau(){
        String tim="";
        Scanner sc=new Scanner(System.in);
        System.out.println("tim phuong tien co mau");
        tim=sc.nextLine();
        int i=0;
        
        for(PTGT tmp:PhuongTienGt){
            if(tim.equalsIgnoreCase( PhuongTienGt.get(i).getMau())){
                PhuongTienGt.get(i).xuat();
            }
           i++;
        }
    }
    public void Menu(){
        System.out.println("1.Nhập đăng ký phương tiện\n" +
"2. Tìm phương tiện theo màu\n" +
"3. Kết thúc.");
    }
}
