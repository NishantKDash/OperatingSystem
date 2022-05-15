package IndividualThreads;
import java.util.ArrayList;
public class Main {
    

    public static void main(String args[]) 
    {
        ArrayList<Thread> allThreads = new ArrayList<>();
        for(int i = 0;i<100;i++)
        {
            NumberPrinter obj = new NumberPrinter(i);
            Thread t = new Thread(obj);
            allThreads.add(t);
            t.start();
        }
  
 try 
 {
    for(int i = 0;i<100;i++)
    allThreads.get(i).join();
    System.out.println("END");
 }
 catch(Exception ex)
 {
     System.out.println(ex);
 }
 

        
    }
}
