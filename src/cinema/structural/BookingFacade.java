package cinema.structural;

public class BookingFacade {

    private MovieService movieService;
    private PaymentService paymentService;
    private TicketService ticketService;

    public BookingFacade() {
        movieService = new MovieService();
        paymentService = new PaymentService();
        ticketService = new TicketService();
    }

    public void bookTicket(String movie, double amount) {
        movieService.selectMovie(movie);
        paymentService.processPayment(amount);
        ticketService.printTicket();
    }
}
