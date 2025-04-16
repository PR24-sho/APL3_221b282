public class App {
    public static void main(String args[]) {
        Crow crow = new IndianCrow();
        AdapterCrow adapterCrow = new AdapterCrow(crow);
        client(adapterCrow);
    }
    public static void client(Swan swan) {
        swan.swim();
        swan.eat();
        swan.sing();
    }
}
