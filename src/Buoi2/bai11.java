
package Buoi2;

import java.util.Scanner;


public class bai11 {
   static int [][]tichmatran=new int [100][100];
    static Scanner sc=new Scanner(System.in);
    static void nhapmangA(int [][]a,int n){
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                System.out.printf("a[%d][%d]=",i,j);
                a[i][j]=sc.nextInt();
            }
        }
    }
     static void nhapmangB(int [][]b,int n){
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                System.out.printf("a[%d][%d]=",i,j);
                b[i][j]=sc.nextInt();
            }
        }
    }
     static void tich(int [][]a,int n,int [][]b){
         
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 
                 tichmatran[i][j]=0;
                 for(int k=0;k<n;k++){
                     tichmatran[i][j]=tichmatran[i][j]+a[i][k]*b[k][j];
                 }
             }
         }
       for(int i=0;i<n;i++){
           System.out.print("\n");
           for(int j=0;j<n;j++){
               System.out.print(" "+tichmatran[i][j]);
           }
       }
     }
     
     public static void main(String[] args){
         int n;
         
         System.out.println("nhap kich co cua 2 ma tran A va B");
         n=sc.nextInt();
         int [][]a=new int [n][n];
          int [][]b=new int [n][n];
         System.out.println("nhap cac phan tu cua ma tran A:");
         nhapmangA(a,n);
         System.out.println("nhap cac phan tu cua ma tran B:");
         nhapmangB(b,n);
         System.out.println("tich cua 2 ma tran la:");
         tich(a,n,b);
     }
    
}
