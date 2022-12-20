package showSystemStatus;
/**
 * This observer implements the interface, Observer and may make changes to the 
 * update method, and or have new functions/methods of its own.
 *
 * @author ("Chidolue Chinedu Zikora")
 * @version (1.0)
 */
import java.util.Observer;
import java.util.Observable;

public class StatusDisplay implements Observer
{  
    private static BinCapacity binCapacity = new BinCapacity();
    private static BatteryPercentage batteryPercentage = new BatteryPercentage();
    private static Map map = new Map();
    private static StatusDisplay statusDisplay = new StatusDisplay();
    
    public StatusDisplay()
    {
        super();
    }

    public void update(Observable observer, Object anything) 
    {
        showStatus();
    }
    
    public String showStatus() 
    {
         return statusLogic();
    }
    
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
    
    public static void main(String[] args) 
    {   
        binCapacity.addObserver(statusDisplay);
        batteryPercentage.addObserver(statusDisplay);
        map.addObserver(statusDisplay);
    }
}
