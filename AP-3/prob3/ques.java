class Mother {
    void show() {
        System.out.println("Mother's show()");
    }
    // static void show() {
    //     System.out.println("Mother's show()");
    // }
}

class Child extends Mother {
    void show() {
        System.out.println("Child's show()");
    }
    // static void show() {
    //     System.out.println("Child's show()");
    // }
}

public class ques {
    public static void main(String[] args) {
        Mother m1 = new Child();
        Child c1 = new Child();
        c1.show();
        m1.show();
        // for static uses
        // Mother.show();
        // Child.show();

    }
}