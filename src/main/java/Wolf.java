public class Wolf implements Drivable, Tradable{
    private int speed;

    public Wolf() {
        this.speed = 2;
    }

    @Override
    public int getPrice() {return 100;}

    @Override
    public void upgradeSpeed()   {this.speed++;}
    @Override
    public void downgradeSpeed() {this.speed--;}
    @Override
    public int getMaxSpeed()     {return this.speed;}

}
