public class Bike extends Tradable, Drivable{
    private int maxSpeed;

    public Bike() {
        this.maxSpeed = 40;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 20;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 20;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
