package showSystemStatus;

/**
 * This is an observable subject containing the maps and new map, 
 * which inherits methods like addObserver() from its superclass, Observable.
 *
 * @author ("Chidolue Chinedu Zikora")
 * @version (1.0)
 */
import java.util.Observable;
import java.util.ArrayList;

public class Map extends Observable
{
    private ArrayList<Map> maps = new ArrayList<Map>();
    private Map newMap = new Map();

    public Map()
    {
        super();
    }
    
    public boolean newMapExists()
    {
        if (newMap != null) 
        {
            notifyObservers();
            maps.add(newMap);
            return true;
        } else 
        {
            return false;
        }
    }
    
    public Map getNewMap() 
    {
        return newMap;
    }
}

