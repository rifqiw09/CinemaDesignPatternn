package cinema.structural;

public abstract class TicketDecorator implements TicketComponent {

    protected TicketComponent ticket;

    public TicketDecorator(TicketComponent ticket) {
        this.ticket = ticket;
    }

    @Override
    public String getDescription() {
        return ticket.getDescription();
    }

    @Override
    public double getCost() {
        return ticket.getCost();
    }
}
