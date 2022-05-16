package addersubtractorwithmutex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String args [])
    {
        ExecutorService ex = Executors.newFixedThreadPool(4);
        Counter obj = new Counter();
      Semaphore semaphore = new Semaphore(1);
        Adder add = new Adder(obj , semaphore);
        Subtractor sub = new Subtractor(obj , semaphore);

        Future<?> addr = ex.submit(add);
        Future<?> subr = ex.submit(sub);

        try{
            addr.get();
            subr.get();
            ex.shutdown();

        
        }
       catch(Exception e)
       {
           System.out.println(e);
       }

       System.out.println(obj.getValue());


    }
}