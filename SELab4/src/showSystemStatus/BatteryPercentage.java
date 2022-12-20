package showSystemStatus;

/**
 * This is an observable subject containing the battery percentage, 
 * which inherits methods like addObserver() from its superclass, Observable.
 *
 * @author ("Chidolue Chinedu Zikora")
 * @version (1.0)
 */
import java.util.Observable;
public class BatteryPercentage extends Observable
{
    private int initialBatteryPercentage = 100;
    private int currentBatteryPercentage = 99;

    public BatteryPercentage()
    {
        super();
    }
    
    public boolean newBatteryPercentage()
    {
        if ((initialBatteryPercentage > currentBatteryPercentage) || 
        (initialBatteryPercentage < currentBatteryPercentage)) 
        {
            notifyObservers();
            initialBatteryPercentage = currentBatteryPercentage;
            return true;
        } else 
        {
            return false;
        }
    }
    
    public boolean batteryBelowSafeLevel()
    {
        if (currentBatteryPercentage < 20)
        {
            notifyObservers();
            initialBatteryPercentage = currentBatteryPercentage;
            return true;
        } else 
        {
            return false;
        }
    }
    
    public int getCurrentBatteryPercentage() 
    {
        return currentBatteryPercentage;
    }
}

