package lab5;

/**
 * This a singleton class (singleton pattern) for a single instance of 
 * the app boundary.
 *
 * @author ("Chidolue Chinedu Zikora")
 * @version (1.0)
 */
import java.util.Observer;
import java.util.Observable;

/**
 * 
 * Preconditions: One of the status of the robot system changes.
 * Postconditions: all observers including this class and the status display are notified.
 *
 */
public class AppBoundary implements Observer
{
    private static AppBoundary instance = new AppBoundary();
    private String status;
    
    private AppBoundary()
    {
        if (instance != null) {
            status = new StatusDisplay().showStatus();
        }
    }

    public static synchronized AppBoundary getInstance() {

    if (instance == null) {
        instance = new AppBoundary();
    }

    return instance;
  }
    
    /**
     * This method is used in keeping all observers up to date.
     */
    public void update(Observable observer, Object anything) 
    {
        System.out.println(status);
    }
}
