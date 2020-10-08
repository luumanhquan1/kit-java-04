
package buoi6.bai2;

import java.util.Scanner;

public class nhanvienxeom extends thongtin {
private int soom;
public void nhap(){
    Scanner sc=new Scanner(System.in);
    super.nhap();
    System.out.println("so km di duoc:");
    soom=sc.nextInt();
}
public int luong(){
    return soom*10000;
}
public void xuat(){
    System.out.println(toString());
}
    @Override
    public String toString() {
        return "nhanvienxeom{" +super.toString()+ "soom=" + luong() + '}';
    }

    public int getSoom() {
        return soom;
    }

    public void setSoom(int soom) {
        this.soom = soom;
    }

    public nhanvienxeom() {
    }

}
