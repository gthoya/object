package com.gthoya.app.theater.offline.client;

import com.gthoya.app.theater.offline.ticket.Ticket;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
