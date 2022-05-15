package IndividualThreads;
public class Main {
    

    public static void main(String args[])
    {
        for(int i = 0;i<100;i++)
        {
            NumberPrinter obj = new NumberPrinter(i);
            Thread t = new Thread(obj);
            t.start();
        }
    }
}
