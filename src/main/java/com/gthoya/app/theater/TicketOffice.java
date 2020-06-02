package com.gthoya.app.theater;

import com.gthoya.app.client.Audience;
import com.gthoya.app.ticket.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void plusAmount(long amount) {
        this.amount += amount;
    }
}
