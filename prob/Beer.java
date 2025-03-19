class Beer{
    private void cool(){
        System.out.println("Chill the beer");
    }
    private void pour(){
        System.out.println("Pour Beer in the beer mug");
    }
    private void serve(){
        System.out.println("Serve in a glass");
    }
    public void TemplateMethod(){
        cool();
        pour();
        serve();
    }
}
