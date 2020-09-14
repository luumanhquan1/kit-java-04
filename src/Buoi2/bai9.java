
package Buoi2;

import java.util.Scanner;

public class bai9 {
     static int [][]a=new int [3][4];
    static Scanner sc=new Scanner(System.in);
public static void taomang(){
    for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            System.out.printf("a[%d][%d]=",i,j);
            a[i][j]=sc.nextInt();
        }
    }
}
public static void hien(){
    for(int i=0;i<3;i++){
      
        for(int j=0;j<4;j++){
            System.out.printf(" %d",a[i][j]);
        }
        System.out.println("\n");
    }
}
   public static int kiemtra(int n){
       if(n<2){
           return 0;
       }
       else {
           for(int i=2;i<=(int) Math.sqrt(n);i++){
               if(n%i==0){
                   return 0;
               }
           }
           return 1;
       }
   }
   public static void lietke(){
    for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            if(kiemtra(a[i][j])==1){
                System.out.println(" "+a[i][j]);
            }
        }
    }
}
    public static void main(String[] args) {
        taomang();
        hien();
        System.out.println("\nSNT=");
        lietke();
        
    }
}
