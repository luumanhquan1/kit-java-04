<<<<<<< HEAD

package Buoi2;

import java.util.Scanner;

public class bai8 {
      
    public static void main(String[] args) {
        int n;
        int a1=1;
        int b1=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n");
        n=sc.nextInt();
        int []a=new int [n];
        for(int i=1;i<=n;i++){
            a[i]=a1+b1;
            a1=b1;
            b1=a[i];
            System.out.println("fibonacci la:"+a[i]);
        }
    }
}
=======

package Buoi2;

import java.util.Scanner;

public class bai8 {
      
    public static void main(String[] args) {
        int n;
        int a1=1;
        int b1=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n");
        n=sc.nextInt();
        int []a=new int [n];
        for(int i=1;i<=n;i++){
            a[i]=a1+b1;
            a1=b1;
            b1=a[i];
            System.out.println("fibonacci la:"+a[i]);
        }
    }
}
>>>>>>> edcc253ae711d7e037d02bacb027b4bcf0b74949
