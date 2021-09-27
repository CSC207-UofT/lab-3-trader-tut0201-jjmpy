public class Zebra implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Zebra() {
        this.maxSpeed = 2;
    }

    @Override
    public String sound() {
        return "Yahooo!";
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
        return 15;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}