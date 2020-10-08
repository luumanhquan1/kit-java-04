
package buoi6.bai2;

import java.util.Scanner;


public class nhapviengiaohang extends thongtin{
    private int sohanggiao;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("so hang giao duoc");
        sohanggiao=sc.nextInt();
    }
public void xuat(){
    System.out.println(toString());
}
public int luonggiaohang(){
    return sohanggiao*33500;
}
    @Override
    public String toString() {
        return "nhapviengiaohang{"+super.toString() + "sohanggiao=" + luonggiaohang() + '}';
    }

    public nhapviengiaohang() {
    }

    public int getSohanggiao() {
        return sohanggiao;
    }

    public void setSohanggiao(int sohanggiao) {
        this.sohanggiao = sohanggiao;
    }
    
    
}
