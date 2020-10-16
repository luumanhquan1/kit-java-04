
package buoi7;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
private float Bankinh;

public void nhap(){
    Scanner sc= new Scanner(System.in);
    System.out.println("nhap ban kinh");
    Bankinh=sc.nextFloat();
}
    public float getBankinh() {
        return Bankinh;
    }

    public void setBankinh(float Bankinh) {
        this.Bankinh = Bankinh;
    }

    public hinhtron() {
        
    }


}
