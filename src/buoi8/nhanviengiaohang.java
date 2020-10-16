
package buoi8;

import java.util.Scanner;

public class nhanviengiaohang extends thongtin{
    private int sohanggiao;
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.println("nhap so hang giao duoc:");
       sohanggiao=sc.nextInt();
    }
    public int tinhtien(){
    return sohanggiao*40000;
    }
public void xuat(){
    System.out.println(toString());
}

    @Override
    public String toString() {
        return "nhanviengiaohang{"+super.toString() + "sohanggiao=" + sohanggiao + "tính tiền"+tinhtien()+'}';
    }

    public int getSohanggiao() {
        return sohanggiao;
    }

    public void setSohanggiao(int sohanggiao) {
        this.sohanggiao = sohanggiao;
    }

    public nhanviengiaohang() {
    }
    
}
