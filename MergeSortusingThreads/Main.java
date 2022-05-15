package MergeSortusingThreads;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String args [])
    {
      

        List<Integer> exa = new ArrayList<>(Arrays.asList(4 , 2 ,1 ,63 , 24 , 11 ,35));
    
        mergesort merges = new mergesort(exa);
        ExecutorService ex = Executors.newCachedThreadPool();
       

        try{
            Future<List<Integer>> sortedList = ex.submit(merges);
            List<Integer> sorted = sortedList.get();
            for(int i =0;i<sorted.size();i++)
            System.out.println(sorted.get(i));

        
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }


    }
    
}
