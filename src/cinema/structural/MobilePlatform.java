package cinema.structural;

public class MobilePlatform implements TicketPlatform {

    @Override
    public void display(String ticketType) {
        System.out.println(ticketType + " displayed on Mobile App");
    }
}
