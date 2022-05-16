package adderandsubtractorsync;

public class Subtractor implements Runnable{

    Counter obj ;

    public Subtractor(Counter obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        for(int i = 0;i<10000000;i++)
         this.obj.subtractValue(i);
    
}
}
