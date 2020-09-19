
package buoi3;

import java.util.Scanner;
public class Bai1 {
    int a;
    int b;
 
 void nhap(){
     Scanner sc=new Scanner(System.in);
     System.out.println("nhap a ");
     a=sc.nextInt();
     System.out.println("mau so:");
     b=sc.nextInt();
 }
void xuat(){
    System.out.printf("%d/%d",a,b);
}


 
}
