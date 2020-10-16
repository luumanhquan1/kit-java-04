
package buoi8;

import java.util.Scanner;

public class nhanvienxeom extends thongtin{
    private int sokm;
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("nhap so km giao duoc");
        sokm=sc.nextInt();
    }
    public int tinhtien(){
        return sokm*30000;
    }
public void xuat(){
    System.out.println(toString());
}
    @Override
    public String toString() {
        return "nhanvienxeom{"+super.toString() + "sokm=" + sokm + "tien luon="+tinhtien()+'}';
    }

    public nhanvienxeom() {
    }

    public int getSokm() {
        return sokm;
    }

    public void setSokm(int sokm) {
        this.sokm = sokm;
    }
    
}
