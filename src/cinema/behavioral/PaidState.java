package cinema.behavioral;

public class PaidState implements TicketState {

    @Override
    public void handle() {
        System.out.println("Ticket is Paid.");
    }
}
