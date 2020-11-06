
package buoi10.bai1;

import java.util.ArrayList;
import java.util.Scanner;


public class quanly {
    Scanner sc=new Scanner(System.in);
    ArrayList<Animal> DongVatList=new ArrayList<>();
public void nhaploaimeo(){
    String chon="";
    while(true){
        if(chon.equalsIgnoreCase("k")){
            break;
        }
        Cat tmp = new Cat("name()");
        DongVatList.add(tmp);
        System.out.println("ban co muon nhap nua kh?? ");
        chon=sc.nextLine();
    }
}
public void nhaploaibo(){
    String chon="";
    while(true){
        if(chon.equalsIgnoreCase("k")){
            break;
        }
        Cow tmp = new Cow("name()");
        DongVatList.add(tmp);
        System.out.println("ban co muon nhap nua kh??");
        chon=sc.nextLine();
    }
}
public void nhaploaicho(){
    String chon="";
    while(true){
        if(chon.equalsIgnoreCase("k")){
            break;
        }
        Dog tmp = new Dog("name()");
        DongVatList.add(tmp);
        System.out.println("ban co muon nhap nua kh?? ");
        chon=sc.nextLine();
    }
}
public void catheloaicho(){
    int i=0;
    for(Animal tmp:DongVatList){
       if(DongVatList.get(i) instanceof Dog){
           tmp.Introduce();
           System.out.println("số cá thể loài chó là:"+tmp.getPopulation());
           
       }
       i++;
    }
}
public void catheloaimeo(){
    int i=0;
    for(Animal tmp:DongVatList){
       if(DongVatList.get(i) instanceof Cat){
           tmp.Introduce();
           System.out.println("số cá thể loài mèo là:"+tmp.getPopulation());
           
       }
       i++;
    }
}
public void catheloaibo(){
    int i=0;
    for(Animal tmp:DongVatList){
       if(DongVatList.get(i) instanceof Dog){
           tmp.Introduce();
           System.out.println("số cá thể loài bò là:"+tmp.getPopulation());
           
       }
       i++;
    }
}
    public quanly() {
    }

   
    
}
