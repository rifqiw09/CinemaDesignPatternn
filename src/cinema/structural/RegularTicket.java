package cinema.structural;

public class RegularTicket extends TicketBridge {

    public RegularTicket(TicketPlatform platform) {
        super(platform);
    }

    @Override
    public void showTicket() {
        platform.display("Regular Ticket");
    }
}
