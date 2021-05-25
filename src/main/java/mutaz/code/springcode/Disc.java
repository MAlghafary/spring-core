package mutaz.code.springcode;

public class Disc extends Product{
    private int capacity;

    public Disc() {
    }

    public Disc(String name, double price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
