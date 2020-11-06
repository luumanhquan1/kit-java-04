
package buoi10.bai1;

import buoi10.bai1.*;
import java.util.Scanner;
public class Cat extends Animal {
     private static int population=0;
     public Cat(String name){     
         super(name);
        System.out.println("con mèo");
        System.out.print("nhập tên:");
         population++;
       super.name(); 
    }
    @Override
    public void makeASound() {
        System.out.println("kêu:mèo méo meo mèo meo");
        System.out.println("name:"+super.getName());
    }
public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public void giveBirth() {
        System.out.println("động vật Cat mới sinh tên là:"+ super.getName()+"'s baby");
    }
   

   
}
