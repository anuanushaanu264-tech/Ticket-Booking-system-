Ticket Booking system 

import java.util.Scanner;

public class TicketBookingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticketPrice = 150;
        int availableTickets = 50;

        System.out.println("===== TICKET BOOKING SYSTEM =====");
        System.out.println("Movie: Kantara");
        System.out.println("Ticket Price: Rs." + ticketPrice);
        System.out.println("Available Tickets: " + availableTickets);

        System.out.print("Enter number of tickets to book: ");
        int tickets = sc.nextInt();

        if (tickets > 0 && tickets <= availableTickets) {
            int totalAmount = tickets * ticketPrice;
            availableTickets -= tickets;

            System.out.println("Booking Successful!");
            System.out.println("Movie: Kantara");
            System.out.println("Tickets Booked: " + tickets);
            System.out.println("Total Amount: Rs." + totalAmount);
            System.out.println("Remaining Tickets: " + availableTickets);
        } else {
            System.out.println("Invalid number of tickets!");
        }

        sc.close();
    }
}
