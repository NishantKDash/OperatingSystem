package MergeSortusingThreads;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.concurrent.Future;

public class mergesort implements Callable<List<Integer>>{

   List<Integer> list;

   public mergesort(List<Integer> list)
   {
       this.list = list;
   }
  
   @Override
   public List<Integer> call() throws Exception
   {
       if(this.list.size() == 0)
       return new ArrayList<>();

       if (this.list.size() == 1) {
        return this.list;
    }

       int n =this.list.size();
       int mid = n/2;

       List<Integer> leftArray = new ArrayList<>();
       List<Integer> rightArray = new ArrayList<>();

       for(int i = 0;i<mid;i++)
       leftArray.add(this.list.get(i));

       for(int i = mid;i<n;i++)
       rightArray.add(this.list.get(i));

     

       mergesort left = new mergesort(leftArray);
       mergesort right = new mergesort(rightArray);

       ExecutorService executor = Executors.newFixedThreadPool(2);

       Future<List<Integer>> leftsortedFuture = executor.submit(left);
       Future<List<Integer>> rightsortedFuture = executor.submit(right);
       
       List<Integer> merged = new ArrayList<>();

       List<Integer> leftSorted = leftsortedFuture.get();
       List<Integer> rightSorted = rightsortedFuture.get();

       int i = 0;
       int j = 0;

       while(i < leftSorted.size() && j < rightSorted.size())
       {
           if(leftSorted.get(i) < rightSorted.get(j))
           {
            merged.add(leftSorted.get(i));
            i++;
           }
          
           else
            {
               merged.add(rightSorted.get(j));
               j++;
            }
          
       }

       while(i<leftSorted.size())
       {
        merged.add(leftSorted.get(i));
        i++;
       }
       

       while(j<rightSorted.size())
       {
        merged.add(rightSorted.get(j));
        j++;
       }
       
 
       return merged;
   }
   
    
}
