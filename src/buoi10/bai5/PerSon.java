
package buoi10.bai5;

import java.util.Scanner;


public abstract class PerSon {
    protected String name;
     protected String address;
     protected String deparment;

    public PerSon(String name, String address, String deparment) {
        this.name = name;
        this.address = address;
        this.deparment = deparment;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
    public abstract void nhap();
    public abstract void xuat();
}
