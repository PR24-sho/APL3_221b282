public class WoodenDuck extends Duck {
    public WoodenDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a Wooden Duck");
    }
}