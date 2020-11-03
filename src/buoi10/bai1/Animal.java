
package buoi10.bai1;
import java.util.Scanner;
public abstract class Animal {
   private String name;

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
    
}
