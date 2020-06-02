package com.gthoya.app.theater;

import com.gthoya.app.client.Audience;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public boolean sellTo(Audience audience) {
        return ticketOffice.sellTicketTo(audience);
    }
}
