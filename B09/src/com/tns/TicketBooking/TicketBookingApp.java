package com.tns.TicketBooking;

class TicketBookingApp {
    public static void main(String[] args) {
        TicketSystem.bookTicket("Person 1");
        TicketSystem.displayTickets();
        
        TicketSystem.bookTicket("Person 2");
        TicketSystem.displayTickets();
        
        TicketSystem.bookTicket("Person 3");
        TicketSystem.displayTickets();
        
        TicketSystem.bookTicket("Person 4");
        TicketSystem.displayTickets();
        
        TicketSystem.bookTicket("Person 5");
        TicketSystem.displayTickets();
    }
}