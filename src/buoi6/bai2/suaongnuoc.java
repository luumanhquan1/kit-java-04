
package buoi6.bai2;

import java.util.Scanner;

public class suaongnuoc extends thongtin {
    private int sogio;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("so gio sua:");
        sogio=sc.nextInt();
    }
public void xuat(){
    System.out.println(toString());
}
public int luongsuaong(){
    return sogio*50000;
}
    @Override
    public String toString() {
        return "suaongnuoc{"+super.toString() + "sogio=" + luongsuaong() + '}';
    }
    public int getSogio() {
        return sogio;
    }

    public void setSogio(int sogio) {
        this.sogio = sogio;
    }

    public suaongnuoc() {
    }
    
    
    
}
