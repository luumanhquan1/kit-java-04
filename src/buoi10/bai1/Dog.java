
package buoi10.bai1;

import buoi10.bai1.*;

public class Dog extends Animal{
     private static int population=0;
 
    public Dog(String name) {
        super(name);
         System.out.println("con chó");
        System.out.print("nhập tên:");
       super.name();
       population++;
    }

    @Override
    public void makeASound() {
        System.out.println("kêu:gâu gâu");
        System.out.println("name:"+super.getName());
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
}
