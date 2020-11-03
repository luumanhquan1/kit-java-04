
package buoi10.bai1;

import buoi10.bai1.*;

public class Cow extends Animal{
private static int population=0;
    public Cow(String name) {
        super(name);
         System.out.println("con bò");
     
        System.out.print("nhập tên:");
        population++;
       super.name();
    }
    
    @Override
    public void makeASound() {
        System.out.println("kêu:bò bò bò");
        System.out.println("name:"+super.getName());
        
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
    
}
