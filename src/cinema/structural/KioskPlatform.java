package cinema.structural;

public class KioskPlatform implements TicketPlatform {

    @Override
    public void display(String ticketType) {
        System.out.println(ticketType + " displayed on Kiosk Machine");
    }
}
