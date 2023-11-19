import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingRegister implements Fileable<BookingRegister>{
    private ArrayList<Booking> bookings;

    public BookingRegister() {
        this.bookings = new ArrayList<>();
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
    
    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }
    
    

    @Override
    public void writeInfo(BookingRegister register) {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(new File("bookings.txt")));
            for (Booking booking : register.getBookings()) {
                write.write(booking.toString()+"\n");
            }
            write.close();
        } catch (IOException ex) {
            Logger.getLogger(BookingRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public BookingRegister readInfoInto(File file) {
        BookingRegister register = new BookingRegister();
        try {
            BufferedReader read = new BufferedReader(new FileReader(file));
            String line;
            Booking booking = new Booking();
            while((line = read.readLine()) != null){
                System.out.println(line);
                System.out.println(booking.parse(line).toString());
                register.addBooking(booking.parse(line));
            }
            read.close();
        } catch (IOException ex) {
            Logger.getLogger(Airline.class.getName()).log(Level.SEVERE, null, ex);
        }
        return register;
    }

}
