
package buoi9.bai3;

import java.util.Scanner;

public class PTGT {
    protected String hangsx;
    protected String namsx;
    protected String giaban;
    protected String mau;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("hang san xuat:");
        hangsx=sc.nextLine();
        System.out.println("nam san xuat");
        namsx=sc.nextLine();
        System.out.println("gia ban:");
        giaban=sc.nextLine();
        System.out.println("mau");
        mau=sc.nextLine();
    }
   public void xuat(){
       System.out.println(toString());
   }

    @Override
    public String toString() {
        return  "hangsx=" + hangsx + ", namsx=" + namsx + ", giaban=" + giaban + ", mau=" + mau + '}';
    }

    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public String getNamsx() {
        return namsx;
    }

    public void setNamsx(String namsx) {
        this.namsx = namsx;
    }

    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public PTGT() {
    }
   
}
