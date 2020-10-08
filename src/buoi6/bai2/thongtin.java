
package buoi6.bai2;

import java.util.Scanner;

public class thongtin {
    protected String hoten;
    protected int tuoi;
    protected String gioitinh;
    protected String sdt;
    protected String diachi;
    protected String chieucao;
    protected String cannang;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ho tên:");
        hoten=sc.nextLine();
        System.out.println("nhap tuoi:");
        tuoi=sc.nextInt();
        System.out.println("nhap gioi tinh:");
        gioitinh=sc.nextLine();
       sc.nextLine();
        System.out.println("nhap SDT:");
       
        sdt=sc.nextLine();
        System.out.println("nhap dia chi:");
        diachi=sc.nextLine();
        System.out.println("nhap chieu cao:");
        chieucao=sc.nextLine();
        System.out.println("nhap can nang:");
        cannang=sc.nextLine();
    }
    public void xuat(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "" + "hoten=" + hoten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", sdt=" + sdt + ", diachi=" + diachi + ", chieucao=" + chieucao + ", cannang=" + cannang + '}';
    }

    public thongtin() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getChieucao() {
        return chieucao;
    }

    public void setChieucao(String chieucao) {
        this.chieucao = chieucao;
    }

    public String getCannang() {
        return cannang;
    }

    public void setCannang(String cannang) {
        this.cannang = cannang;
    }
    
    
}
