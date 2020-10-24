
package buoi9.bai2;

import java.util.Scanner;

public class dagiac {
    Scanner sc=new Scanner(System.in);
    
    protected int a[]=new int [100];
public void nhap(){
    
    for(int i=0;i<3;i++){
       a[i]=sc.nextInt();    
    }
}
public int ChuVi(){
    int cv=0;
    for(int i=0;i<3;i++){
        cv=cv+a[i];
    }
    return cv;
}
public float DienTich(){
    return 0;
}
public void xuat(){
    
}
  public void xuatcanh(){
      for(int i=0;i<3;i++){
          System.out.println("canh cua tam giac:  "+a[i]);
      }
  }
}
