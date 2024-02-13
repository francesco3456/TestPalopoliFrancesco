package utils;

public final class ClassSingleton {

    private static volatile ClassSingleton INSTANCE;
    private String info = "Initial info class";
    
    private ClassSingleton() {        
    }
    
    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ClassSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ClassSingleton();
                }
            }
        }
        return INSTANCE;
    }

    // getters and setters
}

