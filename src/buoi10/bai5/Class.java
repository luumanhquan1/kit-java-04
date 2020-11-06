
package buoi10.bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    Scanner sc=new Scanner(System.in);
    ArrayList<PerSon> studentList=new ArrayList<>();
    public void nhapSinhVien(){
        int n;
        int  chon;
        System.out.println("Bạn muốn nhập mấy lớp ???");
            chon=sc.nextInt();
      for(int i=0;i<chon;i++){
            System.out.println("Nhập Thông Tin GVCN");
             PerSon n1=new Teacher("","","","");
 n1.nhap();
            System.out.println("Nhập Số Sinh Viên:");
            n=sc.nextInt();
            studentList.add(n1);
            for(int j=0;j<n;j++){
         PerSon n2=new Student("","","","");
           n2.nhap();
         studentList.add(n2);
        }
        }
    }
    public void xuatsv(){
        for(PerSon tmp:studentList){
            tmp.xuat();
        }
    }
    

    public Class() {
    }
    
}
