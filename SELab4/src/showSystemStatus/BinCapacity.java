package showSystemStatus;

/**
 * This is an observable subject containing the bin capacity, 
 * which inherits methods like addObserver() from its superclass, Observable.
 *
 * @author ("Chidolue Chinedu Zikora")
 * @version (1.0)
 */
import java.util.Observable;
public class BinCapacity extends Observable
{
    private int initialBinCapacity = 100;
    private int currentBinCapacity = 99;

    public BinCapacity()
    {
        super();
    }
    
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
    
    public int getCurrentBinCapacity() 
    {
        return currentBinCapacity;
    }
}

