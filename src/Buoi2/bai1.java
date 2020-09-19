
package Buoi2;

import java.util.Scanner;

public class bai1 {
  static int n;
static int xacnhan=0;
    static Scanner sc=new Scanner(System.in);
    public static void nhapmang(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.printf("a[%d]=",i);
            a[i]=sc.nextInt();
        }
    }
    public static void hienmang(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.printf("%d ",a[i]);
        }
    }
    public static void tangdan(int a[],int n)
    {
        int tmp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;   
                }
            }
        }
        System.out.println("mang da sap xep tang dan la:");
       for(int i=0;i<n;i++){
           System.out.println(" "+a[i]);
       }
       
    }
     public static void giamdan(int a[],int n)
    {
      
        int tmp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;   
                }
            }
        }
        System.out.println("mang da sap xep giam dan la:");
       for(int i=0;i<n;i++){
           System.out.println(" "+a[i]);
       }
       
    }
    public static void menu(){
       
        int []a=new int[100];
            int chon;
            
        do{
            System.out.println("1.tao mang");
            System.out.println("2.sap xep mang theo thu tu tang dan");
            System.out.println("3.sap xep mang theo thu tu giam dan");
            System.out.println("4.thoat");
            System.out.println("---moi ban chon chuc nang");
            chon=sc.nextInt();
          
            switch(chon){
                case 1:
     n=sc.nextInt();
                    nhapmang(a,n);
                  
               break;
                case 2:
                    if(xacnhan==0){
                        System.out.println("ban chua nhap mang");
                    }
                    else{
                    tangdan(a,n);}
                break;
                case 3:
                    if(xacnhan==0){
                        System.out.println("ban chua nhap mang");
                    }else{
                    giamdan(a,n);
                    }
                break;
            }
        }while(chon!=4);
    }
   
    public static void main(String[] args)
    {
        menu();
    }  
}
