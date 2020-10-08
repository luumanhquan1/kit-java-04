
package buoi6.bai1;

import java.util.ArrayList;
import java.util.Scanner;
public class quanlydanhsach {
ArrayList<treem> treemlist;
ArrayList<nguoilon> nguoilonlist;
    public quanlydanhsach() {
       treemlist=new ArrayList<>();
       nguoilonlist=new ArrayList<>();
    }
    public void nhapnguoilon(){
        Scanner sc=new Scanner(System.in);
        nguoilon tmp=new nguoilon();
        String chon= "";
        int i=0;
        while(true){
            if(chon.equalsIgnoreCase("k")){
                break;}
            System.out.println("nhap doc gia nguoi lon thu "+ ++i);
            tmp.nhap();
            nguoilonlist.add(tmp);
            System.out.println("co muon nhap nua kh:");
            chon=sc.nextLine();
        }
        
    }
public void xuatnguoilon(){
    int i=1;
    for(nguoilon tmp : nguoilonlist){
        i++;
        System.out.printf("%d. ",i);
        tmp.xuat();
    }
}
public void nhaptreem(){
    int i=1;
    Scanner sc=new Scanner(System.in);
    String chon="";
    while(true){
        treem tmp=new treem();
        if(chon.equalsIgnoreCase("k")){
            break;
    }
        System.out.println("nhap doc gia tre em thu"+ ++i);
        tmp.nhap();
        treemlist.add(tmp);
        System.out.println("ban co muon nhap nua kh:");
        chon=sc.nextLine();
        
}
}
public void xuattreem(){
    int i=1;
    for(treem tmp : treemlist){
        i++;
        System.out.printf("%d. ",i);
        tmp.xuat();
    }
}
public void menu(){
    System.out.println("1.nhap danh sach nguoi lon:");
    System.out.println("2.nhap danh sach tre em:");
    System.out.println("3.xuat danh sách người lớn");
    System.out.println("4.xuất danh sách trẻ em:");
    System.out.println("5thoát");
}
}