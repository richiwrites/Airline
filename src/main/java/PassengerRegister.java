import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PassengerRegister implements Fileable<PassengerRegister>{
    private ArrayList<Passenger> passengers;

    public PassengerRegister() {
         this.passengers = new ArrayList<Passenger>();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
    
    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }
    
    @Override
    public void writeInfo(PassengerRegister register) {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(new File("bookings.txt")));
            for (Passenger passenger : register.getPassengers()) {
                write.write(passenger.toString()+"\n");
            }
            write.close();
        } catch (IOException ex) {
            Logger.getLogger(BookingRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public PassengerRegister readInfoInto(File file) {
        PassengerRegister register = new PassengerRegister();
        try {
            BufferedReader read = new BufferedReader(new FileReader(file));
            Passenger passenger = new Passenger();
            String line;
            while((line = read.readLine()) != null){
                register.addPassenger(passenger.parse(line));
            }
            read.close();
        } catch (IOException ex) {
            Logger.getLogger(Airline.class.getName()).log(Level.SEVERE, null, ex);
        }
        return register;
    }
    
}
