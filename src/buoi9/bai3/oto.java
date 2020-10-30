
package buoi9.bai3;

import java.util.Scanner;

public class oto extends PTGT {
    protected String sochongoi;
    protected String kieudongco;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
       super.nhap();
        System.out.println("so cho ngoi:");
        sochongoi=sc.nextLine();
        System.out.println("kieu dong co");
        kieudongco=sc.nextLine();
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "oto{" +super.toString() + "sochongoi=" + sochongoi + ", kieudongco=" + kieudongco + '}';
    }

    public oto() {
    }

    public String getSochongoi() {
        return sochongoi;
    }

    public void setSochongoi(String sochongoi) {
        this.sochongoi = sochongoi;
    }

    public String getKieudongco() {
        return kieudongco;
    }

    public void setKieudongco(String kieudongco) {
        this.kieudongco = kieudongco;
    }
    
}
