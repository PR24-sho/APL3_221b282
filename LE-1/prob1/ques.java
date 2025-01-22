class Mother {
    int x;

    void show() {
        System.out.println("Show method in Mother class");
    }
}

class Child extends Mother {
    int y;

    void show() {
        System.out.println(" show ( ) inherited in Child from Mother is called");
    }
}

class ques {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); 

        Child ch = new Child();
        ch.show(); 
    }
}