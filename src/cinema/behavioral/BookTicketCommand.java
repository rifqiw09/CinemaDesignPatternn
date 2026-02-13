package cinema.behavioral;

public class BookTicketCommand implements Command {

    private TicketSystem ticketSystem;

    public BookTicketCommand(TicketSystem ticketSystem) {
        this.ticketSystem = ticketSystem;
    }

    @Override
    public void execute() {
        ticketSystem.bookTicket();
    }
}
