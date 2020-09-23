
package buoi3;

import java.util.Scanner;

public class bai3 {
    int a;
    int b;
    Scanner sc=new Scanner(System.in);
    void nhap(){
        
        System.out.println("nhap tu");
        a=sc.nextInt();
        System.out.println("nhap mau");
        b=sc.nextInt();
    }
    int UCLL(){
        int u=1;
        for(int i=1;i<=a*b;i++){
            if(a%i==0 && b%i==0){
                u=i;
            }
        }
        return u;
    }
    void cong(bai3 ps){
        bai3 cong=new bai3();
        cong.a=this.a*ps.b + ps.a*this.b;
        cong.b=this.b*ps.b;
        cong.UCLL();
        System.out.println("cong:");
        cong.xuat();
    }
    void hieu(bai3 ps){
        bai3 hieu=new bai3();
        hieu.a=this.a*ps.b-ps.a*this.b;
        hieu.b=this.b*ps.b;
        hieu.UCLL();
        System.out.println("hieu");
        hieu.xuat();
    }
    void tich(bai3 ps){
        bai3 tich=new bai3();
        tich.a=this.a*ps.b;
        tich.b=this.b*ps.a;
        tich.UCLL();
        System.out.println("a/b=");
        tich.xuat();
    }
     void nhan(bai3 ps){
        bai3 nhan=new bai3();
        nhan.a=this.a*ps.a;
        nhan.b=this.b*ps.b;
        nhan.UCLL();
        System.out.println("a*b=");
        nhan.xuat();
    }
    void xuat(){
        System.out.printf("phan so %d/%d\n",a/UCLL(),b/UCLL());
    }
}
