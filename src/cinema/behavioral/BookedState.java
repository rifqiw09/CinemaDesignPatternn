package cinema.behavioral;

public class BookedState implements TicketState {

    @Override
    public void handle() {
        System.out.println("Ticket is Booked.");
    }
}
