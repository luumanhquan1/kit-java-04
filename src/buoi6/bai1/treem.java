
package buoi6.bai1;
import java.util.Scanner;
public class treem extends docgia {
private String nguoidaidien;
public void nhap(){
    Scanner sc=new Scanner(System.in);
    super.nhap();
    System.out.println("nhap ten nguoi dai dien:");
    nguoidaidien=sc.nextLine();
}
public int tienlamthe(){
    
        return sothangcohieuluc*5000;

}
public void xuat(){
    System.out.println(toString());
}

    @Override
    public String toString() {
        return "treem{" + super.toString() + "nguoidaidien=" + nguoidaidien + ", tienlam=" + tienlamthe() + '}';
    }
    public treem() {
    }
    public String getNguoidaidien() {
        return nguoidaidien;
    }
    public void setNguoidaidien(String nguoidaidien) {
        this.nguoidaidien = nguoidaidien;
    }


}
