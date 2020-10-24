
package buoi9.bai2;

import java.util.Scanner;
import java.util.ArrayList;
public class quanky {
    Scanner sc=new Scanner(System.in);
    ArrayList<dagiac> TamGiacList=new ArrayList<>();

    public quanky() {
    }
    public void nhaptamgiac(){
        int n;
        System.out.println("nhap so tam giac");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            tamgiac tmp=new tamgiac();
            tmp.nhap();
            TamGiacList.add(tmp);
        }
    }
    public void xuattamgiac(){
        int i=0;
        for(dagiac tmp:TamGiacList){
            System.out.println("------CANH TAM GIAC-----"+ ++i);
            tmp.xuat();
        }
    }
    public void Dientichtamgiacmax(){
        for(int i=0;i<TamGiacList.size()-1;i++){
            for(int j=i+1;j<TamGiacList.size();j++){
                if(TamGiacList.get(i).DienTich()<TamGiacList.get(j).DienTich()){
                   dagiac tmp;
                   tmp=TamGiacList.get(i);
                   TamGiacList.set(i,TamGiacList.get(j));
                   TamGiacList.set(j, tmp);
                }
            }
        }
    }
    public void xuatcanhDienTichlon(){
        
          
        Dientichtamgiacmax();
 int i=0;
           do{
               TamGiacList.get(0).xuatcanh();
         i++;      
           }while(i<1);
        
    }
    public void menu(){
        System.out.println("1.nhap tam giac:");
        System.out.println("2.xuat canh,chu vi,dien tich");
        System.out.println("3.xuat canh cua tam giac co dien tichs lon nhat");
        System.out.println("4.thoat");
    }
}
