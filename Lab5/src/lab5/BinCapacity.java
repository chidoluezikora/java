package lab5;

/**
 * This is an observable subject containing the bin capacity, 
 * which inherits methods like addObserver() from its superclass, Observable.
 *
 * @author ("Chidolue Chinedu Zikora")
 * @version (1.0)
 */
import java.util.Observable;

/**
 * 
 * Preconditions: the bin capacity changes.
 * Postconditions: all observers including the app boundary and status display are notified.
 *
 */
public class BinCapacity extends Observable
{
    private int initialBinCapacity;
    private int currentBinCapacity;

    public BinCapacity(int initialBinCapacity, int currentBinCapacity)
    {
        super();
        this.initialBinCapacity = initialBinCapacity;
        this.currentBinCapacity = currentBinCapacity;
    }
    
    /**
     * This method helps in finding out whether there is a change in bin capacity.
     * @return true if there is a new bin capacity and vice versa.
     */
    public boolean newBinCapacity()
    {
        if ((initialBinCapacity > currentBinCapacity) || 
        (initialBinCapacity < currentBinCapacity)) 
        {
            notifyObservers();
            initialBinCapacity = currentBinCapacity;
            return true;
        } else 
        {
            return false;
        }
    }
    
    /**
     * This method is used in accessing the initial bin capacity in other classes.
     * @return initial bin capacity
     */
    public int getInitialBinCapacity()
    {
        return initialBinCapacity;
    }
    
    /**
     * This method is used in accessing the current bin capacity in other classes.
     * @return current bin capacity
     */
    public int getCurrentBinCapacity() 
    {
        return currentBinCapacity;
    }
}
