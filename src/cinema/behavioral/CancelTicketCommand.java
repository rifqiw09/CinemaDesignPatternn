package cinema.behavioral;

public class CancelTicketCommand implements Command {

    private TicketSystem ticketSystem;

    public CancelTicketCommand(TicketSystem ticketSystem) {
        this.ticketSystem = ticketSystem;
    }

    @Override
    public void execute() {
        ticketSystem.cancelTicket();
    }
}
