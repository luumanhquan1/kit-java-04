
package buoi3;

import java.util.Scanner;

public class bai7 {
    String hovaten="hello va";
    String quequan;
    int namsinh;
    String masv;
    Scanner sc=new Scanner(System.in);
    void nhap(){
        System.out.print("nhap ho và tên:");
        hovaten=sc.nextLine();
        System.out.print("que quan sinh vien:");
        quequan=sc.nextLine();
        System.out.print("nam sinh:");
        namsinh=sc.nextInt();
       
        System.out.print("nhap mã sinh viên:");
        sc.nextLine();
        masv=sc.nextLine();
    }
    void gioitinh(){
   String[] t;
        t = hovaten.split("\\s");
        if("thi".equals(t[1])||"thị".equals(t[1])||"thi".equals(t[2])||"thị".equals(t[2])){
            System.out.println("sinh viên là nữ");
        }
        else {
            System.out.println("sinh viên là nam");
        }
}
    void tuoi(){
        int xettuoi;
        xettuoi=2020-namsinh;
        if(xettuoi>=20){
            System.out.println("sinh viên là 20+");
        }
        else{
            System.out.println("chưa đủ 20 tuổi đâu");
        }
    }
    void makhoa(){
        if(masv.startsWith("AT")||masv.startsWith("at")){
            System.out.println("sinh viên học khoa an toàn thông tin");
        }
        if(masv.startsWith("CT")||masv.startsWith("ct")){
            System.out.println("sinh viên học khoa công nghệ thông tin");
    }
        if(masv.startsWith("DT")||masv.startsWith("dt")){
            System.out.println("sinh viên học khoa điện tử viễn thông");
        }
    }     
}
