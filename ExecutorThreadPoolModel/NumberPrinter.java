package ExecutorThreadPoolModel;

public class NumberPrinter implements Runnable {

    private int number;
  
    public NumberPrinter(int number)
    {
        this.number = number;
    }
      @Override
      public void run()
      {
          System.out.println("The number is " + number);
      }
  }
  