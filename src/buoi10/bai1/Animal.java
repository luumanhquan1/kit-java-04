
package buoi10.bai1;
import buoi10.bai1.*;
import java.util.Scanner;
public abstract class Animal {
   private int population=0;
   private String name;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void name() {
       Scanner sc=new Scanner(System.in);
       name=sc.nextLine();
    }
public void Introduce(){
    makeASound();
}
    public Animal(String name) {
        this.name = name;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public abstract void makeASound();

    public abstract void giveBirth();
}
