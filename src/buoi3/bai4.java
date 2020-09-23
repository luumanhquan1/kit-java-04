
package buoi3;

import java.util.Scanner;


public class bai4 {
    int a,b;
    Scanner sc=new Scanner(System.in);
    void nhap(){
        System.out.println("NHAP TU");
        a=sc.nextInt();
        System.out.println("nhap mau");
        b=sc.nextInt();
    }
    void chuyen(){
        float c;
        c=(float)a/b;
        System.out.printf("so thap phan=%f\n",c);
    }
}
