package com.gthoya.app;

import com.gthoya.app.client.Audience;
import com.gthoya.app.client.Bag;
import com.gthoya.app.theater.Theater;
import com.gthoya.app.theater.TicketOffice;
import com.gthoya.app.theater.TicketSeller;
import com.gthoya.app.ticket.Invitation;
import com.gthoya.app.ticket.Ticket;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(50L);
        Ticket ticket2 = new Ticket(50L);

        TicketOffice ticketOffice = new TicketOffice(100L, ticket1, ticket2);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        Audience audience1 = new Audience(new Bag(new Invitation(), 0L));
        Audience audience2 = new Audience(new Bag(0L));

        theater.enter(audience1);
        theater.enter(audience2);
    }
}
