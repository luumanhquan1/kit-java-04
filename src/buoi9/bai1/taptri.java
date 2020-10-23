
package buoi9.bai1;

import java.util.Scanner;


public class taptri extends ThuocTinh {
    private int sophathanh;
    private int thangphathanh;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("so thang phat hanh");
        sophathanh=sc.nextInt();
        System.out.println("so thang phat hanh");
        thangphathanh=sc.nextInt();
    }
    public void xuat(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "taptri{"+ super.toString()+ "sophathanh=" + sophathanh + ", thangphathanh=" + thangphathanh + '}';
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public int getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(int thangphathanh) {
        this.thangphathanh = thangphathanh;
    }

    public taptri() {
    }
    
}
