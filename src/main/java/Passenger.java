
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Passenger extends Person implements Parseable<Passenger>,Appendable{

    private String passportNumber;
    private int seats;

    public Passenger() {
    }

    public void setPassportNumber(String passportNumber) throws PassportException, NullPointerException {
        if (passportNumber == null || passportNumber.equals(" ") || passportNumber.isEmpty()) {
            throw new NullPointerException("Please enter your passport number!");
        }

        int count = 0;
        for (int i = 2; i < passportNumber.length(); i++) {
            if (isDigit(passportNumber.charAt(i))) {
                count++;
            }
        }

        if (passportNumber.length() == 9 && isUpperCase(passportNumber.charAt(0)) && isUpperCase(passportNumber.charAt(1)) && count == 7) {
            this.passportNumber = passportNumber;
        } else {
            throw new PassportException("Please enter a valid passport number!");
        }
    }

    public String getPassportNumber() {
        return passportNumber;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + passportNumber + "," + seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public Passenger parse(String str) {
        Passenger p = new Passenger();
        try {
            String[] parts = str.split(",");
            p.setFullName(parts[0]);
            p.setAddress(parts[1]);
            p.setGender(parts[2]);
            p.setPhoneNumber(parts[3]);
            p.setNID(parts[4]);
            p.setDateOfBirth(LocalDate.parse(parts[5]));
            p.setPassportNumber(parts[6]);
            p.setSeats(Integer.parseInt(parts[7]));
        } catch (PassportException | NullPointerException | NIDException | PhoneNumberException ex) {
            Logger.getLogger(Passenger.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    @Override
    public void appendInfo() {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(new File("passengers.txt"), true));
            write.append(this.toString()+ "\n");
            write.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
