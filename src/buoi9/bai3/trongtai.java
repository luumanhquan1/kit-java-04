
package buoi9.bai3;

import java.util.Scanner;


public class trongtai extends PTGT {
    protected String trongtai;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("trong tai");
        trongtai=sc.nextLine();
    }
    public void xuat(){
        System.out.println(toString());
    }

    public trongtai() {
    }

    @Override
    public String toString() {
        return "trongtai{"+ super.toString() + "trongtai=" + trongtai + '}';
    }

    public String getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(String trongtai) {
        this.trongtai = trongtai;
    }
    
}
