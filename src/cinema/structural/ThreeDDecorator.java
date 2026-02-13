package cinema.structural;

public class ThreeDDecorator extends TicketDecorator {

    public ThreeDDecorator(TicketComponent ticket) {
        super(ticket);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 3D Glasses";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15000;
    }
}
