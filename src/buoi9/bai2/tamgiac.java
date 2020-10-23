
package buoi9.bai2;

import java.util.Scanner;


public class tamgiac extends dagiac {
    private float Dientich=0;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("so canh cua tam giac");
        super.nhap();
    }
    
    public float DienTich(){
        float a1,a2,a3;
        float p;
        for(int i=0;i<3;i++){
        a1=a[0];
        a2=a[1];
        a3=a[2];
        p=(float)1/2*(a1+a2+a3);
        Dientich=(float)Math.sqrt(p*(p-a1)*(p-a2)*(p-a3));}
        return Dientich;
    }
    
    public void xuat(){
        System.out.println("dien tich tam giac:"+DienTich());
        System.out.println("chu vi tam giac:"+ChuVi());
        super.xuat();
    }

    public tamgiac() {
    }
    public float getDientich() {
        return Dientich;
    }
    public void setDientich(float Dientich) {
        this.Dientich = Dientich;
    }
 
    
    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    
}
