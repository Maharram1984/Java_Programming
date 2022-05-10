package day48_Encapsulation.FlightTicket;

import my_utilities.StringUtil;

public class Flight {
    /*         - instance variables:
               - type (first, business, economy)
               - departure location
               - arrival location   */

    private String type;
    private String departureLocation, arrivalLocation;
    /*         - constructor: initialize all fields
               -> only allow the given ticket types to be set
               - encapsulate all the fields  */

    public Flight(String type, String departureLocation, String arrivalLocation) {
        setType(type);
        setDepartureLocation(departureLocation);
        setArrivalLocation(arrivalLocation);
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("economy")) {
            this.type = type;
        }
    }
    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getType() {
        return type;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public String toString() {
        String info = "[Flight Type is: " + type + ", Departure location is " +
                departureLocation + ", Arrival location is " + arrivalLocation + "]";
        return info;
    }
}
