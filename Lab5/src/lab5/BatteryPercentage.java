package lab5;

/**
 * This is an observable subject containing the battery percentage, 
 * which inherits methods like addObserver() from its superclass, Observable.
 *
 * @author ("Chidolue Chinedu Zikora")
 * @version (1.0)
 */
import java.util.Observable;

/**
 * 
 * Preconditions: the battery percentage changes and or the battery is below safe level (20%).
 * Postconditions: all observers including the app boundary and status display are notified.
 *
 */
public class BatteryPercentage extends Observable
{
    private int initialBatteryPercentage;
    private int currentBatteryPercentage;

    public BatteryPercentage(int initialBatteryPercentage, int currentBatteryPercentage)
    {
        super();
        this.initialBatteryPercentage = initialBatteryPercentage;
        this.currentBatteryPercentage = currentBatteryPercentage;
    }
    
    /**
     * This method is used in checking if the battery percentage changes.
     * @return true is there is a new battery percentage and vice versa
     */
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
    
    /**
     * This method is used in checking if the battery is below safe level.
     * @return true if the battery is below safe level and vice versa.
     */
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
    
    /**
     * This method is used in accessing the initial battery percentage in other classes.
     * @return the initial battery percentage
     */
    public int getInitialBatteryPercentage()
    {
        return initialBatteryPercentage;
    }
    
    /**
     * This method is used in accessing the current battery percentage in other classes.
     * @return the current battery percentage
     */
    public int getCurrentBatteryPercentage() 
    {
        return currentBatteryPercentage;
    }
}
