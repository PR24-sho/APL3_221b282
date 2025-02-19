public class LakeDuck extends Duck {
    public LakeDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a Lake Duck");
    }
}