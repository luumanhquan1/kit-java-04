
package buoi6.bai1;
import java.util.Scanner;
public class nguoilon extends docgia {
    private String CMND;

    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("nhap so CMND");
        CMND=sc.nextLine();
    }
    public void xuat(){
        System.out.println(toString());
    }
public int tienlamthe(){
    return sothangcohieuluc*10000;
}
    @Override
    public String toString() {
        return "nguoilon{" + super.toString()+ "CMND=" + CMND + ", tienlam=" + tienlamthe() + '}';
    }
    public nguoilon(){
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

}
