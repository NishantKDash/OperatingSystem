package ExecutorThreadPoolModel;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String args [])
    {
        ExecutorService ex  = Executors.newSingleThreadExecutor(); 
        for(int i = 0;i<100;i++)
        {
            NumberPrinter obj = new NumberPrinter(i);
            ex.submit(obj);
        } 
    }


    
}
