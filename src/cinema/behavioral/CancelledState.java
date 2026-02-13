package cinema.behavioral;

public class CancelledState implements TicketState {

    @Override
    public void handle() {
        System.out.println("Ticket is Cancelled.");
    }
}
