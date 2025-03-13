package sixClassAndObjects;

public class FlightDTO {

    private String flightNumber;
    private String airline;
    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private String arrivalTime;
    private double ticketPrice;

    private static final String AIRPORT_CODE_PREFIX = "FL-";
    private static final int MAX_PASSENGERS_PER_FLIGHT = 180;

    public FlightDTO(String flightNumber, String airline, String departureCity, String arrivalCity,
            String departureTime, String arrivalTime, double ticketPrice) {
        this.flightNumber = AIRPORT_CODE_PREFIX + flightNumber;
        this.airline = airline;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ticketPrice = ticketPrice;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public static int getMaxPassengersPerFlight() {
        return MAX_PASSENGERS_PER_FLIGHT;
    }

    @Override
    public String toString() {
        return "FlightDTO{"
                + "flightNumber='" + flightNumber + '\''
                + ", airline='" + airline + '\''
                + ", departureCity='" + departureCity + '\''
                + ", arrivalCity='" + arrivalCity + '\''
                + ", departureTime='" + departureTime + '\''
                + ", arrivalTime='" + arrivalTime + '\''
                + ", ticketPrice=" + ticketPrice
                + '}';
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
