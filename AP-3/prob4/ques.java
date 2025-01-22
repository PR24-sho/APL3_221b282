class One {
    int x;

    public One(int x) {
        this.x = x;
    }
}

class Two extends One {
    public Two(int x) {
        super(x);
    }
}

public class ques {
    public static void main(String[] args) {
        One o = new One(6);
        Two t = new Two(5);
        System.out.println(t.x);
        System.out.println(o.x);
    }
}