import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Airline implements Sortable, Fileable<Airline>{
    private ArrayList<Flight> flights;
    
    public Airline() {
        this.flights = new ArrayList<>();
    }

    public Airline(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
    
    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    @Override
    public String toString() {
        StringBuilder flightsInfo = new StringBuilder();
        for (Flight flight : flights) {
            flightsInfo.append(flight.toString()).append("\n");
        }
        return flightsInfo.toString();
    }


    public Airline sortByFromAndTo(String from, String to) {
        Airline sortedFlights = new Airline();
        for (Flight flight : flights) {
            if(flight.getFrom().equals(from) && flight.getTo().equals(to))
                sortedFlights.addFlight(flight);
        }
        return sortedFlights;
    }

    @Override
    public void writeInfo(Airline airline) {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(new File("flights.txt")));
            for (Flight flight : airline.getFlights()) {
                write.write(flight.toString()+"\n");
            }
            write.close();
        } catch (IOException ex) {
            Logger.getLogger(Airline.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Airline readInfoInto(File file) {
        Airline airline = new Airline();
        try {
            BufferedReader read = new BufferedReader(new FileReader(file));
            Flight flight = new Flight();
            String line;
            while((line = read.readLine()) != null){
                System.out.println("Parsed Flight: " + flight.parse(line)); // Debug print
                airline.addFlight(flight.parse(line));
            }
            read.close();
        } catch (IOException ex) {
            Logger.getLogger(Airline.class.getName()).log(Level.SEVERE, null, ex);
        }
        return airline;
    }

   
}
