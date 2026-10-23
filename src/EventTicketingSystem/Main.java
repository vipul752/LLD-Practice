package EventTicketingSystem;

public class Main {
    public static void main(String[] args) {
        TicketBookingService ticketBookingService = new TicketBookingService();

        SeatValidator seatValidator = new SeatValidator();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        QRCodeGenerator qrCodeGenerator = new QRCodeGenerator();
        EmailService emailService = new EmailService();

        ticketBookingService.bookTicket("CONF-2025", "A12", "alice@example.com",
                99.99, seatValidator, paymentProcessor, qrCodeGenerator, emailService);
    }
}
