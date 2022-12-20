package lab5;

/**
 * This observer implements the interface, Observer and may make changes to the 
 * update method, and or have new functions/methods of its own.
 *
 * @author ("Chidolue Chinedu Zikora")
 * @version (1.0)
 */
import java.util.Observer;
import java.util.Observable;

/**
 * 
 * Preconditions: One of the status of the robot system changes.
 * Postconditions: all observers including the app boundary and this class are notified.
 *
 */
public class StatusDisplay implements Observer
{  
    private static BinCapacity binCapacity = new BinCapacity(100, 99);
    private static BatteryPercentage batteryPercentage = new BatteryPercentage(100, 99);
    private static Map map = new Map();
    private static StatusDisplay statusDisplay = new StatusDisplay();
    
    public StatusDisplay()
    {
        super();
    }

    /**
     * This method is used in keeping all observers up to date.
     */
    public void update(Observable observer, Object anything) 
    {
        observer = (Observable) anything;
        showStatus();
    }
    
    /**
     * This method is used in showing the status of the system.
     * @return the status message
     */
    public String showStatus() 
    {
         return statusLogic();
    }
    
    /**
     * This method provides logic for returning different strings for different scenarios.
     * @return the appropriate status message
     */
    private String statusLogic() 
    {
        if (binCapacity.newBinCapacity() &&
        batteryPercentage.newBatteryPercentage() && 
        batteryPercentage.batteryBelowSafeLevel() &&
        map.newMapExists())
        {
            return "Battery below recommended level at " + batteryPercentage.getCurrentBatteryPercentage() 
            + "%\nBin capacity at " + binCapacity.getCurrentBinCapacity() + 
            "%\nCheck out the new map!";
        } else if (binCapacity.newBinCapacity() &&
        batteryPercentage.newBatteryPercentage() && 
        !batteryPercentage.batteryBelowSafeLevel() &&
        map.newMapExists()) 
        {
            return "Battery level at " + batteryPercentage.getCurrentBatteryPercentage() 
            + "%\nBin capacity at " + binCapacity.getCurrentBinCapacity() + 
            "%\nCheck out the new map!";
        } else if (binCapacity.newBinCapacity() &&
        !batteryPercentage.newBatteryPercentage() && 
        batteryPercentage.batteryBelowSafeLevel() &&
        map.newMapExists())
        {
            return "Battery below recommended level" + "\nBin capacity at " + binCapacity.getCurrentBinCapacity() + 
            "%\nCheck out the new map!";
        } else if (!binCapacity.newBinCapacity() &&
        batteryPercentage.newBatteryPercentage() && 
        !batteryPercentage.batteryBelowSafeLevel() &&
        map.newMapExists())
        {
            return "Battery below recommended level" + 
            "\nCheck out the new map!";
        } else if (!binCapacity.newBinCapacity() &&
        !batteryPercentage.newBatteryPercentage() && 
        batteryPercentage.batteryBelowSafeLevel() &&
        map.newMapExists()) 
        {
             return "Battery level at " + batteryPercentage.getCurrentBatteryPercentage() + 
            "%\nCheck out the new map!";   
        } else if (binCapacity.newBinCapacity() &&
        batteryPercentage.newBatteryPercentage() && 
        !batteryPercentage.batteryBelowSafeLevel() &&
        !map.newMapExists()) 
        {
            return "Bin capacity at " + binCapacity.getCurrentBinCapacity() + 
            "%\nBattery level at " + 
            batteryPercentage.getCurrentBatteryPercentage() + "%";
        } else if (binCapacity.newBinCapacity() &&
        !batteryPercentage.newBatteryPercentage() && 
        batteryPercentage.batteryBelowSafeLevel() &&
        !map.newMapExists()) 
        {
            return "Bin capacity at " + binCapacity.getCurrentBinCapacity() + 
            "%\nBattery below safe level";
        } else if (!binCapacity.newBinCapacity() &&
        !batteryPercentage.newBatteryPercentage() && 
        batteryPercentage.batteryBelowSafeLevel() &&
        !map.newMapExists()) 
        {
             return "Battery below recommended level";
        } else if (!binCapacity.newBinCapacity() &&
        batteryPercentage.newBatteryPercentage() && 
        !batteryPercentage.batteryBelowSafeLevel() &&
        !map.newMapExists()) 
        {
            return "Battery level at " + 
            batteryPercentage.getCurrentBatteryPercentage() + "%";
        } else if (!binCapacity.newBinCapacity() &&
        batteryPercentage.newBatteryPercentage() && 
        batteryPercentage.batteryBelowSafeLevel() &&
        !map.newMapExists())
        {
            return "Battery below recommended level at " + 
            batteryPercentage.getCurrentBatteryPercentage() + "%";
        } else if (!binCapacity.newBinCapacity() &&
        batteryPercentage.newBatteryPercentage() && 
        batteryPercentage.batteryBelowSafeLevel() &&
        map.newMapExists()) 
        {
            return "Battery below recommended level at " + 
            batteryPercentage.getCurrentBatteryPercentage() + 
            "%\nCheck out new map!";
        } else if (binCapacity.newBinCapacity() &&
        batteryPercentage.newBatteryPercentage() && 
        batteryPercentage.batteryBelowSafeLevel() &&
        !map.newMapExists()) 
        {
            return "Battery below recommended level at " + batteryPercentage.getCurrentBatteryPercentage() 
            + "%\nBin capacity at " + binCapacity.getCurrentBinCapacity() + 
            "%";
        } else 
        {
            return "No status updates";
        }
    }
    
    /**
     * This is the main application demonstrator 
     * @param args
     */
    public static void main(String[] args) 
    {   
        binCapacity.addObserver(statusDisplay);
        batteryPercentage.addObserver(statusDisplay);
        map.addObserver(statusDisplay);
    }
    
    /**
     * This method is used in accessing the bin capacity in other classes.
     * @return bin capacity
     */
    public BinCapacity getBinCapacity() 
    {
        return binCapacity;
    }
    
    /**
     * This class is used in accessing the battery percentage in other classes.
     * @return battery percentage
     */
    public BatteryPercentage getBatteryPercentage()
    {
        return batteryPercentage;
    }
}
