package entities;

/**
 *
 * @author jrimland
 */
public class Introvert extends Customer {
    
    public Introvert(String customerName)
    {
        super(customerName);
    }
    
    public boolean needToMove(int numNeighbors)
    {
        if (numNeighbors > 3)
            return true;
        else
            return false;
    }
    
}
