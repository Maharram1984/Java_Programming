package day48_Encapsulation.FlightTicket;

import day48_Encapsulation.FlightTicket.Flight;

public class UseFlight {
    public static void main(String[] args) {

        Flight ticket = new Flight("Business","Dulles","Baku");
        System.out.println(ticket);
        ticket.setType("First");
        System.out.println(ticket);
        System.out.println(ticket.getDepartureLocation());
        System.out.println(ticket.getArrivalLocation());
    }
}
