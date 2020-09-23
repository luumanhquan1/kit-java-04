
package buoi3;
import java.util.Scanner;
public class bai6 {
    String tensp;
    String masp;
    float muav;
    float banr;
    int soluong;
    float tienlai;
    Scanner sc=new Scanner(System.in);
    void nhap(){
        System.out.print("nhap vao ten san phan:");
        tensp=sc.nextLine();
        System.out.print("nhap ma san pham:");
        masp=sc.nextLine();
        System.out.print("gia mua vao:");
        muav=sc.nextFloat();
        System.out.print("gia ban ra:");
        banr=sc.nextFloat();
        System.out.print("so luong");
        soluong=sc.nextInt();
    }
    void tinh(){
        bai6 ban=new bai6();
        bai6 ban1=new bai6();
        ban.tienlai=(banr-muav)*soluong;
        System.out.print("ban het thi cua hang do lai:");
        ban.xuat();
       float i;
       i=(float)soluong*2/3;
       ban1.tienlai=banr*i-muav*soluong;
       if(ban1.tienlai<0){
           System.out.println("tien lo:");
           ban1.xuat();
       }
    }
    void xuat(){
        System.out.printf("tien:%.3f\n",tienlai);
    }
    
}
