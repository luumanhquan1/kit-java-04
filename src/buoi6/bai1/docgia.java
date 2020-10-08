
package buoi6.bai1;

import java.util.Scanner;

public class docgia {
    protected String hoten;
    protected String ngaylapthe;
    protected int sothangcohieuluc;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ho ten:");
        hoten=sc.nextLine();
        System.out.println("ngay lap the:");
        ngaylapthe=sc.nextLine();
        System.out.println("so thang co hieu luc:");
        sothangcohieuluc=sc.nextInt();
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return  "" + "hoten=" + hoten + ", ngaylapthe=" + ngaylapthe + ", sothangcohieuluc=" + sothangcohieuluc + '}';
    }

    public docgia() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaylapthe() {
        return ngaylapthe;
    }

    public void setNgaylapthe(String ngaylapthe) {
        this.ngaylapthe = ngaylapthe;
    }

    public int getSothangcohieuluc() {
        return sothangcohieuluc;
    }

    public void setSothangcohieuluc(int sothangcohieuluc) {
        this.sothangcohieuluc = sothangcohieuluc;
    }
    
}
