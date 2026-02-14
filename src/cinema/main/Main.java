package cinema.main;

import cinema.creational.CinemaSystem;
import cinema.creational.UserFactory;
import cinema.model.User;
import cinema.model.Movie;
import cinema.model.Ticket;
import cinema.structural.Payment;
import cinema.structural.OldPaymentSystem;
import cinema.structural.PaymentAdapter;
import cinema.structural.*;
import cinema.structural.BookingFacade;
import cinema.behavioral.*;

public class Main {

    public static void main(String[] args) {

        // Singleton
        CinemaSystem system1 = CinemaSystem.getInstance();
        CinemaSystem system2 = CinemaSystem.getInstance();

        system1.startSystem();

        System.out.println("Status System");
        System.out.println(system1 == system2);
        System.out.println("Status System End");

        // Factory
        User admin = UserFactory.createUser("admin", "Adrian");
        System.out.println("Admin: " + admin.getName());
        User customer = UserFactory.createUser("customer", "Fallore");
        System.out.println("Customer: " + customer.getName());

        // Prototype
        Movie movie1 = new Movie("Avengers", 120);
        Movie movie2 = movie1.clone();

        System.out.println("Movie 1: " + movie1.getTitle());
        System.out.println("Movie 2 (Clone): " + movie2.getTitle());
        // Builder
        Ticket ticket = new Ticket.TicketBuilder()
                .setMovieTitle("Avengers")
                .setSeatNumber("A10")
                .setCustomerName("Budi")
                .setPrice(50000)
                .build();

        ticket.printTicket();
        // Adapter
        OldPaymentSystem oldSystem = new OldPaymentSystem();
        Payment payment = new PaymentAdapter(oldSystem);

        payment.pay(50000);

        // Decorator
        TicketComponent ticketComponent = new BasicTicket();
        ticketComponent = new SnackDecorator(ticketComponent);
        ticketComponent = new ThreeDDecorator(ticketComponent);

        System.out.println("Description: " + ticketComponent.getDescription());
        System.out.println("Total Cost: " + ticketComponent.getCost());

        // Facade
        BookingFacade facade = new BookingFacade();
        facade.bookTicket("Avengers", 50000);

        // Observer
        Cinema cinema = new Cinema();

        Observer cust1 = new CustomerObserver("Budi");
        Observer cust2 = new CustomerObserver("Rina");

        cinema.registerObserver(cust1);
        cinema.registerObserver(cust2);

        cinema.setNewMovie("Spiderman");

        // Strategy
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CashPayment());
        context.executePayment(50000);

        context.setStrategy(new CreditCardPayment());
        context.executePayment(75000);

        context.setStrategy(new EWalletPayment());
        context.executePayment(60000);

        // State
        TicketContext ticketContext = new TicketContext();

        ticketContext.setState(new BookedState());
        ticketContext.applyState();

        ticketContext.setState(new PaidState());
        ticketContext.applyState();

        ticketContext.setState(new CancelledState());
        ticketContext.applyState();

        // Command
        TicketSystem ticketSystem = new TicketSystem();

        Command bookCommand = new BookTicketCommand(ticketSystem);
        Command cancelCommand = new CancelTicketCommand(ticketSystem);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(bookCommand);
        remote.pressButton();

        remote.setCommand(cancelCommand);
        remote.pressButton();

        // Bridge
        TicketBridge regularMobile = new RegularTicket(new MobilePlatform());
        regularMobile.showTicket();

        TicketBridge vipKiosk = new VipTicket(new KioskPlatform());
        vipKiosk.showTicket();

    }
}
