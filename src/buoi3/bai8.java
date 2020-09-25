
package buoi3;

import java.util.Scanner;

public class bai8 {
    String tenhang;
    int soluong;
    float nhapv;
    float banr;
    int ngaynhap;
    int thangnhap;
    int namnhap;
    int ngaysd;
    int thangsd;
    int namsd;
    Scanner sc=new Scanner(System.in);
    void nhap(){
        System.out.print("nhap ten hang:");
        tenhang=sc.nextLine();
        System.out.print("so luong:");
        soluong=sc.nextInt();
        System.out.println("giá nhập vào");
        nhapv=sc.nextFloat();
        System.out.println("giá bán ra");
        banr=sc.nextFloat();
        System.out.println(" ngày nhập(ngày.tháng.năm)");
        System.out.print("ngày:");
        ngaynhap=sc.nextInt();
        System.out.print("tháng:");
        thangnhap=sc.nextInt();
        System.out.print("năm:");
        namnhap=sc.nextInt();
         System.out.println(" hạn su dung(ngày.tháng.năm)");
        System.out.print("ngày:");
        ngaysd=sc.nextInt();
        System.out.print("tháng:");
        thangsd=sc.nextInt();
        System.out.print("năm:");
        namsd=sc.nextInt();
    }
    void xuat(){
        System.out.printf("|%10s||%10s||%10s||%10s||%10s||%10s|\n","tenhang","soluong","gia nhap vao","ban ra","ngay nhap","han su dung");
        System.out.printf("|%10s||%10d||%10.0f||%10.0f|%9d/%d/%d||%9d/%d/%d|",tenhang,soluong,nhapv,banr,ngaynhap,thangnhap,namnhap,ngaysd,thangsd,namsd);
    }
}
