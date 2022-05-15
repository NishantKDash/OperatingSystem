package adderandsubtractor;

public class Counter {
    private int value = 0;

    public Counter(int value)
    {
        this.value = value;
    }

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }

    public synchronized void addValue(int i) {
        this.value += i;
    }

    public synchronized void subtractValue(int i) {
        this.value -= i;
    }
}