
package buoi9.bai3;

import java.util.Scanner;

public class xemay extends PTGT {
    protected String congsuat;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("cong suat");
        congsuat=sc.nextLine();
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "xemay{"+ super.toString() + "congsuat=" + congsuat + '}';
    }

    public String getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(String congsuat) {
        this.congsuat = congsuat;
    }

    public xemay() {
    }
}
