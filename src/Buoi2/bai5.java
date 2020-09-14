
package Buoi2;

import java.util.Scanner;

public class bai5 {
     static  Scanner sc=new Scanner(System.in);
public static void taomang(int a[],int n){
    for(int i=0;i<n;i++){
        System.out.printf("a[%d]",i);
        a[i]=sc.nextInt();
    }
}
public static void kiemtra(int a[],int n){
    int k;
    int j=0;
    System.out.println("nhap phan tu k");
    k=sc.nextInt();
  if(k>n){
      System.out.println("nhap so nho hon n");
  }
  else{
      for(int i=0;i<n;i++){
         j=a[k];
      }
      System.out.printf("a[%d]=%d",k,j);
  }
}
    
    public static void main(String[] args) {
       int n;
        System.out.println("nhap n");
       n=sc.nextInt();
       int []a=new int [n];
       taomang(a,n);
       kiemtra(a,n);
    }
}
