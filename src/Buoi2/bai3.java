<<<<<<< HEAD

package Buoi2;

import java.util.Scanner;


public class bai3 {
    
    static Scanner sc=new Scanner(System.in);
    public static void taomang(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.printf("a[%d]=",i);
            a[i]=sc.nextInt();
        }
  
    }
    public static int kiemtra(int n){
        if(n<2){
            return 0;
        }
        else {
            for(int i=2;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0){
                    return 0;
                }
                
            }return 1;
        }
    }
    public static void lietke(int a[],int n){
        for(int i=0;i<n;i++){
           if(kiemtra(a[i])==1){
               System.out.println(" "+a[i]);
           }
         
        }
        }
    
   
    public static void main(String[] args) {
        
        int n;
        n=sc.nextInt();
        int []a=new int [n];
        taomang(a,n);
        lietke(a,n);
        
    }
}
=======

package Buoi2;

import java.util.Scanner;


public class bai3 {
    
    static Scanner sc=new Scanner(System.in);
    public static void taomang(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.printf("a[%d]=",i);
            a[i]=sc.nextInt();
        }
  
    }
    public static int kiemtra(int n){
        if(n<2){
            return 0;
        }
        else {
            for(int i=2;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0){
                    return 0;
                }
                
            }return 1;
        }
    }
    public static void lietke(int a[],int n){
        for(int i=0;i<n;i++){
           if(kiemtra(a[i])==1){
               System.out.println(" "+a[i]);
           }
         
        }
        }
    
   
    public static void main(String[] args) {
        
        int n;
        n=sc.nextInt();
        int []a=new int [n];
        taomang(a,n);
        lietke(a,n);
        
    }
}
>>>>>>> edcc253ae711d7e037d02bacb027b4bcf0b74949
