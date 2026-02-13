package cinema.structural;

public class SnackDecorator extends TicketDecorator {

    public SnackDecorator(TicketComponent ticket) {
        super(ticket);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Snack";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20000;
    }
}
