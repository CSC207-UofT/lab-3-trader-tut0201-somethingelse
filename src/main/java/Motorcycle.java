public class Motorcycle implements Drivable, Tradable {
    private int maxSpeed;

    public Motorcycle() { this.maxSpeed = 5;}

    @Override
    public void upgradeSpeed() {this.maxSpeed++;}

    @Override
    public void downgradeSpeed() {this.maxSpeed++;}

    @Override
    public int getMaxSpeed() { return this.maxSpeed; }

    @Override
    public int getPrice() { return 10; }

    @Override
    public String toString(){
        String id = super.toString();
        return id +  " Max speed: " + this.maxSpeed;
    }

}
