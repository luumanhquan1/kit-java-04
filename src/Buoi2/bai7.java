
package Buoi2;

import java.util.Scanner;


public class bai7 {
      static Scanner sc=new Scanner(System.in);
public static void taomang(int a[],int n){
    for(int i=0;i<n;i++){
        System.out.printf("a[%d]=",i);
        a[i]=sc.nextInt();
    }
   
}
public static void solon(int a[],int n){
    int max;
    max=a[0];
    int min;
    min=a[0];
    for(int i=0;i<n;i++){
        if(max<a[i]){
            max=a[i];
        }
    }
    System.out.println("max="+max);
    for(int i=0;i<n;i++){
        if(min>a[i]){
            min=a[i];
        }
    }
    System.out.println("min="+min);
}
    
    public static void main(String[] args) {
        int n;
        System.out.println("nhap n");
        n=sc.nextInt();
        int []a=new int [n];
        taomang(a,n);
        solon(a,n);
    }
    
}
