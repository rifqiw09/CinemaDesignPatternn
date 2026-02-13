package cinema.model;

public class Ticket {

    private String movieTitle;
    private String seatNumber;
    private String customerName;
    private double price;

    private Ticket(TicketBuilder builder) {
        this.movieTitle = builder.movieTitle;
        this.seatNumber = builder.seatNumber;
        this.customerName = builder.customerName;
        this.price = builder.price;
    }

    public void printTicket() {
        System.out.println("=== TICKET ===");
        System.out.println("Movie: " + movieTitle);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Customer: " + customerName);
        System.out.println("Price: " + price);
        System.out.println("================");
    }

    // ===== BUILDER CLASS =====
    public static class TicketBuilder {

        private String movieTitle;
        private String seatNumber;
        private String customerName;
        private double price;

        public TicketBuilder setMovieTitle(String movieTitle) {
            this.movieTitle = movieTitle;
            return this;
        }

        public TicketBuilder setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public TicketBuilder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public TicketBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }
}
