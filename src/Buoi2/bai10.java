
package Buoi2;

import java.util.Scanner;

public class bai10 {
      static int b[]= new int [100];
    static int [][]a=new int [3][3];
    static Scanner sc=new Scanner(System.in);
public static void taomang(){
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
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
public static void sapxep(){
   
    int k=0;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           b[k]=a[i][j];
            k++;
        }
    }
    int tmp;
    for(int i=0;i<3*3-1;i++){
        for(int j=i+1;j<3*3;j++){
            if(b[i]<b[j]){
                tmp=b[i];
                b[i]=b[j];
                b[j]=tmp;
            }
        }
    }
    for(int i=0;i<9;i++){
        if(i==3||i==6){
            System.out.print("\n");
        }
        System.out.print(" "+b[i]);
       
    }
}

  
    public static void main(String[] args) {
        
        taomang();
 sapxep();
        
        
        
    }
}
