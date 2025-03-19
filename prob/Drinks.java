class Rum{
    private void pour(){
        System.out.println("Pour 60ml of Rum");
    }
    private void add(){
        System.out.println("Add 10ml of water");
    }
    private void mix(){
        System.out.println("Mix well");
    }
    private void serve(){
        System.out.println("Serve in a glass");
    }
    public void TemplateMethod(){
        pour();
        add();
        mix();
        serve();
    }
}
class Drinks{
    public static void main(String[] args){
        Rum rum = new Rum();
        rum.TemplateMethod();
    }
}