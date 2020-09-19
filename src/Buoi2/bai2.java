
package Buoi2;

import java.util.Scanner;

public class bai2 {
      static Scanner sc=new Scanner(System.in);
    public static void nhapmang(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]=",i);
            a[i]=sc.nextInt();
        }
    }
    public static int cong(int a[],int n)
    {
        int t=0;
        for(int i=0;i<n;i++){
            t=t+a[i];
        }
        return t;
       
    }
   public static void main(String[] args)
   {
       int n;
       n=sc.nextInt();
       int []a=new int [n];
       nhapmang(a,n);
       System.out.println("tong cac phan tu cua mang ="+cong(a,n));
   }
}
