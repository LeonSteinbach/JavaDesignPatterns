public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void loadConfiguration(String path) {
        System.out.println(String.format("loaded configuration: %s", path));
    }

    public void saveConfiguration(String path) {
        System.out.printf("saved configuration: %s\n", path);
    }
}
