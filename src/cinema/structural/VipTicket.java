package cinema.structural;

public class VipTicket extends TicketBridge {

    public VipTicket(TicketPlatform platform) {
        super(platform);
    }

    @Override
    public void showTicket() {
        platform.display("VIP Ticket");
    }
}
