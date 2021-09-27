public class Jonah implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Jonah() {
        this.maxSpeed = 2000;
    }

    @Override
    public String sound() {
        return "Hello, my name is Jonah!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 10000000000000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
