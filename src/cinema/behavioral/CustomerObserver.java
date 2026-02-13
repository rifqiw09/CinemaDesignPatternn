package cinema.behavioral;

public class CustomerObserver implements Observer {

    private String name;

    public CustomerObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
