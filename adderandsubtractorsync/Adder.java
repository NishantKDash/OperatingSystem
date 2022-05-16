package adderandsubtractorsync;

public class Adder implements Runnable {

    Counter obj ;

    public Adder(Counter obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        for(int i = 0;i<10000000;i++)
         this.obj.addValue(i);
    }
    
}
