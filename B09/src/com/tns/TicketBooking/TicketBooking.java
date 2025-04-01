package com.tns.TicketBooking;

class TicketSystem {
    private static int ticket = 5;
    
    public static void bookTicket(String name) {
        if (ticket > 0) {
            System.out.println(name + " has booked the ticket. Ticket number: " + ticket);
            ticket--;
        } else {
            System.out.println("Sorry, " + name + ", no tickets available.");
        }
    }
    
    public static void displayTickets() {
        if (ticket > 0) {
            System.out.println("Tickets available: " + ticket);
        } else {
            System.out.println("All tickets are booked.");
        }
    }
}

