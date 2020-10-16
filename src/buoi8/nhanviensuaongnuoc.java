
package buoi8;

import java.util.Scanner;

public class nhanviensuaongnuoc extends thongtin {
    private int sogiosua;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("so gio sua");
        sogiosua=sc.nextInt();
    }
    public int tinhtien(){
    return sogiosua*50000;
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return '}' + "nhanviensuaongnuoc{"+super.toString()+ "sogiosua=" + sogiosua +"tinh tien"+ tinhtien();
    }

    

    public nhanviensuaongnuoc() {
    }

    public int getSogiosua() {
        return sogiosua;
    }

    public void setSogiosua(int sogiosua) {
        this.sogiosua = sogiosua;
    }

   
    
}
