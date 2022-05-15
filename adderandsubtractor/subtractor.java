package adderandsubtractor;

public class subtractor implements Runnable {

        Counter obj ;
    
        public subtractor(Counter obj)
        {
            this.obj = obj;
        }
    
      @Override
      public void run()
      {
          for(int i = 0;i<10000000;i++)
          this.obj.subtractValue(1);
      }
        
    }
