package com.tns.TicketBooking;

public class TicketBookingSystem {
    private static int tickets = 5;
    
    static {
        System.out.println("Total tickets available: " + tickets);
    }
    
    public void bookTicket() {
        if (tickets != 0) {
            System.out.println("Ticket booked successfully!");
            tickets--;
        } else {
            System.out.println("All tickets are sold out!");
        }
        displayTickets();
    }
    
    public static void displayTickets() {
        System.out.println("Tickets remaining: " + tickets);
    }

	@Override
	public String toString() {
		return "TicketBookingSystem []";
	}
}

