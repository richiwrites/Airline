
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Booking implements Parseable<Booking>,Appendable{
    private Flight flight;
    private Passenger passenger;

    public Booking() {
    }

    public Booking(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return  flight.toString() + "  " + passenger.toString() ;
    }

    @Override
    public Booking parse(String bookingString) {
        String[] parts = bookingString.split("  "); // Splitting by two spaces as the delimiter
        if (parts.length != 2) {
            // Handle incorrect format or missing parts
            return null;
        }

        String[] flightInfo = parts[0].split(","); // Splitting flight details
        String[] passengerInfo = parts[1].split(","); // Splitting passenger details

        // Create Flight object
        Flight f = new Flight();
        f.parse(String.join(",", flightInfo));

        // Create Passenger object
        Passenger p = new Passenger();
        p.parse(String.join(",", passengerInfo));

        // Create Booking object
        Booking b = new Booking(f, p);
        return b;
    }
    
    @Override
    public void appendInfo() {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(new File("bookings.txt"), true));
            write.append(this.toString()+ "\n");
            write.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public static void main(String[] args) {
        Booking b = new Booking();
        b.parse("2,Embraer 135,Dhaka,Sylhet,2023-11-20T03:30,2023-11-20T04:30,800,37  Liam Johnson,555 Pine Rd,Male,01234567867,98765432277,1970-08-27,QQ7890123,3");
        b.toString();
                
    }
}
