package cinema.creational;

public class CinemaSystem {

    private static CinemaSystem instance;

    // Constructor private supaya tidak bisa dibuat dari luar
    private CinemaSystem() {}

    public static CinemaSystem getInstance() {
        if (instance == null) {
            instance = new CinemaSystem();
        }
        return instance;
    }

    public void startSystem() {
        System.out.println("Cinema System is Running...");
    }
}
