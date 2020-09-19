
package Buoi2;

import java.util.Scanner;

public class bai6 {
      static Scanner sc=new Scanner(System.in);
public static void taomang(int a[],int n){
    for(int i=0;i<n;i++){
        System.out.printf("a[%d]=",i);
        a[i]=sc.nextInt();
    }
}
public static void xep(int a[],int n)
{
    int tmp;
    int tpq;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]<0){
                if(a[i]>a[j]){
                 tmp=a[i];
                 a[i]=a[j];
                 a[j]=tmp;
                }
            }
            
                }
    }
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++){
                    if(a[i]<0){
                if(a[i]<a[j]){
                    tpq=a[i];
                    a[i]=a[j];
                    a[j]=tpq;
                }
            }
        
    }
            }
    for(int i=0;i<n;i++){
        System.out.print(" "+a[i]);
    }
}
    
    public static void main(String[] args) {
 int n;
        System.out.println("nhap n");
 n=sc.nextInt();
int []a=new int [n];
 taomang(a,n);
 xep(a,n);
    }
}
