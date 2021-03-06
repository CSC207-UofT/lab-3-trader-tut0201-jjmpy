/**
 * Impliments class Donkey
 */
public class Donkey implements Drivable, Domesticatable, Tradable {
        private int maxSpeed;

        public Donkey() {
            this.maxSpeed = 3;
        }

        @Override
        public String sound() {
            return "HeeHaw!";
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
            return 10;
        }

        @Override
        public String toString(){
            String id = super.toString();
            return id + " (Max speed: " + this.maxSpeed +")";
        }
    }

