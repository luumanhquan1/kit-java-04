
package buoi10.bai1;
public class Dog extends Animal{
    
 
    public Dog(String name) {
        super(name);
         System.out.println("con chó");
        
        System.out.print("nhập tên:");
       super.name();
    }

    @Override
    public void makeASound() {
        System.out.println("kêu:gâu gâu");
        System.out.println("name:"+super.getName());
    }
    
}
