
package buoi9.bai1;

import java.util.Scanner;

public class sach extends ThuocTinh{
    private String tentacgia;
    private int sotrang;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("ten tac gia");
        tentacgia=sc.nextLine();
        System.out.println("nhap so trang");
        sotrang=sc.nextInt();
    }
    public void  xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "sach{" +super.toString()+ "tentacgia=" + tentacgia + ", sotrang=" + sotrang + '}';
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public sach() {
    }
    
}
