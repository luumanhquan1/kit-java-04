/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10.bai1;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class Cat extends Animal {
    
    public Cat(String name) {
         super(name);
        System.out.println("con mèo");
        System.out.print("nhập tên:");
       super.name();
    }

    @Override
    public void makeASound() {
        System.out.println("kêu:mèo méo meo mèo meo");
        System.out.println("name:"+super.getName());
    }

}
