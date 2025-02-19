public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        woodenDuck.display();
        woodenDuck.performQuack();
        woodenDuck.performFly();

        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();

        lakeDuck.display();
        lakeDuck.performQuack();
        lakeDuck.performFly();
    }
}