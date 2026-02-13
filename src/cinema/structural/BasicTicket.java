package cinema.structural;

public class BasicTicket implements TicketComponent {

    @Override
    public String getDescription() {
        return "Regular Ticket";
    }

    @Override
    public double getCost() {
        return 50000;
    }
}
