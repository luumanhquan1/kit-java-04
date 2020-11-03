
package buoi10.bai1;

public class Cow extends Animal{


    public Cow(String name) {
        super(name);
         System.out.println("con bò");
     
        System.out.print("nhập tên:");
       super.name();
    }
    @Override
    public void makeASound() {
        System.out.println("kêu:bò bò bò");
        System.out.println("name:"+super.getName());
        
    }
    
    
}
