
package buoi9.bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        quanky n1=new quanky();
        int chon;
        while(true){
            n1.menu();
            chon=sc.nextInt();
            switch(chon){
                case 1:
                    n1.nhaptamgiac();
                    break;
                    case 2:
                    n1.xuattamgiac();
                    break;
                    case 3:
                    n1.xuatcanhDienTichlon();
                    break;
                    case 4:
                  return ;
            }
        }
    }
}
