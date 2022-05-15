package adderandsubtractor;

public class adder implements Runnable{

    Counter obj ;

    public adder(Counter obj)
    {
        this.obj = obj;
    }

  @Override
  public void run()
  {
      for(int i = 0;i<10000000;i++)
      this.obj.addValue(1);
  }
    
}
