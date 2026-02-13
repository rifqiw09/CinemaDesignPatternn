package cinema.behavioral;

public class TicketContext {

    private TicketState state;

    public void setState(TicketState state) {
        this.state = state;
    }

    public void applyState() {
        state.handle();
    }
}
