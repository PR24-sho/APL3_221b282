public class AdapterCrow implements Swan {
    private Crow crow;
    public AdapterCrow(Crow crow) {
        this.crow = crow;
    }
    public void swim() {
        crow.fly();
    }
    public void eat() {
        crow.eat(); 
    }

    @Override
    public void sing() {
        crow.cry(); 
    }
}