package cinema.structural;

public abstract class TicketBridge {

    protected TicketPlatform platform;

    public TicketBridge(TicketPlatform platform) {
        this.platform = platform;
    }

    public abstract void showTicket();
}
