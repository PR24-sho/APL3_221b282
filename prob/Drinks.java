class Drinks{
    public static void main(String[] args){
        Rum rum = new Rum();
        rum.TemplateMethod();
        System.out.println("**********************************");
        Beer beer = new Beer();
        beer.TemplateMethod();
    }
}