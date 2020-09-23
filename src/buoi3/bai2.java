
package buoi3;

import java.util.Scanner;

public class bai2 {
    int a;
    int b;
    void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap tu so:");
        a=sc.nextInt();
        System.out.println("nhap mau so");
        b=sc.nextInt();
    }
    int UCLL(){
        int u=1;
        for(int i=1;i<a*b;i++){
            if(a%i==0&&b%i==0){
                u=i;
            }
        }
        return u;
    }
    void xuat(){
        System.out.printf("%d/%d",a/UCLL(),b/UCLL());
    }
}
