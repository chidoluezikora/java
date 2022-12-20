package lab5;

/**
 * This is an observable subject containing the maps and new map, 
 * which inherits methods like addObserver() from its superclass, Observable.
 *
 * @author ("Chidolue Chinedu Zikora")
 * @version (1.0)
 */
import java.util.Observable;
import java.util.ArrayList;

/**
 * 
 * Preconditions: there exists a new map.
 * Postconditions: all observers including the app boundary and status display are notified.
 *
 */
public class Map extends Observable
{
    private ArrayList<Object> maps = new ArrayList<Object>();
    private Object newMap;

    public Map()
    {
        super();
    }
    
    /**
     * The method checks if there is a new map or not.
     * @return true if there is a new map and vice versa.
     */
    public boolean newMapExists()
    {
        if (true) 
        {
            notifyObservers();
            maps.add(newMap);
            return true;
        } else 
        {
            return false;
        }
    }
    
    /**
     * This method is used in accessing the new map in other classes
     * @return new map
     */
    public Object getNewMap() 
    {
        return newMap;
    }
}
