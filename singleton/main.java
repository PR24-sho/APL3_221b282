
class EagerSingleton {
    // Instance is created at class loading time
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {
    }

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}

// Lazy Initialization Singleton (Thread-Safe with Double-Checked Locking)
class LazySingleton {
    private static volatile LazySingleton instance;

    // Private constructor to prevent instantiation
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {

        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}

// Main class to test Singleton implementations
public class main {
    public static void main (String[] args) {
        // Testing Eager Singleton
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        System.out.println("Eager Singleton: " + (eager1 == eager2)); // true

        // Testing Lazy Singleton
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println("Lazy Singleton: " + (lazy1 == lazy2)); // true
    }
}
