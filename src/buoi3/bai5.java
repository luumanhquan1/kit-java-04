
package buoi3;

import java.util.Scanner;

public class bai5 {
    String ten;
    String masv;
    String quequan;
    float a1;
    float a3;
    float nl1;
    float dtb;
    Scanner sc=new Scanner(System.in);
    void nhap(){
        System.out.println("ten sinh vien");
        ten=sc.nextLine();
        System.out.println("nhap ma sinh vien");
        masv=sc.nextLine();
        System.out.println("nhap que quan");
        quequan=sc.nextLine();
        System.out.println("nhap vao diem a1");
        a1=sc.nextFloat();
        System.out.println("nhap vao diem a3");
        a3=sc.nextFloat();
        System.out.println("nhap vao diem nguyen li 1");
        nl1=sc.nextFloat();
    }
    void diemtb(){
        bai5 tb=new bai5();
        tb.dtb=(a1+a3+nl1)/3;
        System.out.print("DIEM TRUNG BINH CUA sinh vien do:");
        tb.xuat();
    }
    void kiemtra(){
        bai5 thilai=new bai5();
            int ktr=0;
            int i=0;
            do{
                if(a1<4){
                    ktr++;
                }
                 if(a3<4){
                    ktr++;
                }
                if(nl1<4){
                    ktr++;
                }
                i++;
            }while(i!=1);
            thilai.dtb=ktr*90;
            System.out.print("so tien thi lai:");
            thilai.xuat();
    }
    void xuat(){
        System.out.printf("%.3f\n",dtb);
    }
}
