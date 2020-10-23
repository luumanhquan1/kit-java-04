
package buoi9.bai1;

import java.util.Scanner;


public class ThuocTinh {
    protected String matailieu;
    protected String tennhaxb;
    protected String sobanphathanh;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ma tai lieu");
        matailieu=sc.nextLine();
        System.out.println("ten nha xuat ban");
        tennhaxb=sc.nextLine();
        System.out.println("so ban phat hanh");
        sobanphathanh=sc.nextLine();
    }
    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ThuocTinh{" + "matailieu=" + matailieu + ", tennhaxb=" + tennhaxb + ", sobanphathanh=" + sobanphathanh + '}';
    }

    public String getMatailieu() {
        return matailieu;
    }

    public void setMatailieu(String matailieu) {
        this.matailieu = matailieu;
    }

    public String getTennhaxb() {
        return tennhaxb;
    }

    public void setTennhaxb(String tennhaxb) {
        this.tennhaxb = tennhaxb;
    }

    public String getSobanphathanh() {
        return sobanphathanh;
    }

    public void setSobanphathanh(String sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

    public ThuocTinh() {
    }
    
}
