package com.gthoya.app;

public class Bag {
    private long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }

    public void plusAmount(long amount) {
        this.amount += amount;
    }

    public long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);

            return 0L;
        } else {
            minusAmount(ticket.getFee());
            setTicket(ticket);

            return ticket.getFee();
        }
    }
}