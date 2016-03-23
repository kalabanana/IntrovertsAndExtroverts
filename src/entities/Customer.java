package entities;


import java.awt.Rectangle;

/**
 *
 * @author jrimland
 */
public abstract class Customer extends Rectangle {
    private String customerName;
    public Customer(String customerName)
    {
        this.customerName = customerName;
    }            
}
