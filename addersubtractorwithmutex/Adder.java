package addersubtractorwithmutex;
import java.util.concurrent.*;

public class Adder implements Runnable {

    Counter obj ;
    Semaphore semaphore;

    public Adder(Counter obj , Semaphore semaphore)
    {
        this.obj = obj;
        this.semaphore = semaphore;
    }

    public void run()
    {
        for(int i = 0;i<10000000;i++)
        {
            try{
                semaphore.acquire();
                int currentValue = this.obj.getValue();
                int newValue = currentValue + 1;
                this.obj.setValue(newValue);
                semaphore.release();

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        
        }
    }
    
}
