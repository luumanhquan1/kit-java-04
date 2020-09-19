<<<<<<< HEAD

package Buoi2;

import java.util.Scanner;


public class bai12 {
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
         int g=1;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
             if(i==j){
                 g=g*tichmatran[i][j];
             }
           }
       }
         if(g==1){
             System.out.print("B la ma tran nghic dao cau A");
         }
         else{
             System.out.println("B khong phai la ma tran nghich dao cua A");
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
         tich(a,n,b);
     }
}
=======

package Buoi2;

import java.util.Scanner;


public class bai12 {
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
         int g=1;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
             if(i==j){
                 g=g*tichmatran[i][j];
             }
           }
       }
         if(g==1){
             System.out.print("B la ma tran nghic dao cau A");
         }
         else{
             System.out.println("B khong phai la ma tran nghich dao cua A");
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
   
         tich(a,n,b);
     }
}
>>>>>>> edcc253ae711d7e037d02bacb027b4bcf0b74949
