
package buoi8;

import java.util.Scanner;

public class thongtin {
    protected String hoten;
    protected String tuoi;
    protected String gioitinh;
    protected String sodt;
    protected String diachi;
    protected String cannang;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap họ tên:");
        hoten=sc.nextLine();
        System.out.println("nhập tuổi:");
        tuoi=sc.nextLine();
        System.out.println("nhập giới tính:");
        gioitinh=sc.nextLine();
        System.out.println("nhap so dien thoai:");
        sodt=sc.nextLine();
        System.out.println("nhập địa chỉ:");
sc.nextLine();
diachi=sc.nextLine();
        System.out.println("nhập cân nặng");
        cannang=sc.nextLine();
    }
    public void xuat(){
        System.out.println(toString());
    }
public int tinhtien(){
return 0;
}
    @Override
    public String toString() {
        return "thongtin{" + "hoten=" + hoten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", sodt=" + sodt + ", diachi=" + diachi + ", cannang=" + cannang + '}';
    }

    public thongtin() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getCannang() {
        return cannang;
    }

    public void setCannang(String cannang) {
        this.cannang = cannang;
    }
    
}
