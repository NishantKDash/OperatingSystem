package adderandsubtractorsync;

public class Counter {

   private int value = 0;

   public int getValue()
   {
       return this.value;
   }

   public  synchronized void addValue(int i)
   {
       this.value += i;
   } 

   public synchronized void subtractValue(int i)
   {
       this.value -= i;
   }
    
}
