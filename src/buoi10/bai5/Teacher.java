
package buoi10.bai5;

import java.util.Scanner;

public class Teacher extends PerSon {
    private String rank;
    private String TenLop;
Scanner sc=new Scanner(System.in);
    public Teacher(String rank, String name, String address, String deparment) {
        super(name, address, deparment);
        this.rank = rank;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public void xuat() {
        System.out.println("Tên Lớp:"+TenLop);
        System.out.println("Tên:"+super.getName());
        System.out.println("Địa Chỉ:"+super.getAddress());
        System.out.println("Bộ Môn:"+super.getDeparment());
        System.out.println("Cấp Bậc:"+rank);
    }

    @Override
    public void nhap() {
        System.out.println("Tên Lớp:");
        TenLop=sc.nextLine();
         System.out.println("Tên:");
        name=sc.nextLine();
        System.out.println("Địa Chỉ:");
        address=sc.nextLine();
        System.out.println("Bộ môn:");
     deparment=sc.nextLine();
        System.out.println("Cấp Bậc:");
        rank=sc.nextLine();
    }
   
}
