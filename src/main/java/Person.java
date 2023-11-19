
import static java.lang.Character.isDigit;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Person {
    private String fullName;
    private String address;
    private String gender;
    private String phoneNumber;
    private String NID;
    private LocalDate dateOfBirth;

    public Person() {
    }

    public void setFullName(String fullName) throws NullPointerException{
        if(fullName == null || fullName.equals(" ") || fullName.isEmpty()){
            throw new NullPointerException("Please enter a name!");
        }
        this.fullName = fullName;
    }

    public void setAddress(String address) throws NullPointerException{
        if(address == null || address.equals(" ") || address.isEmpty()){
            throw new NullPointerException("Please enter an address!");
        }
        this.address = address;
    }

    public void setGender(String gender) throws NullPointerException{
        if(gender == null || gender.equals(" ") || gender.isEmpty()){
            throw new NullPointerException("Please select a gender!");
        }
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneNumberException, NullPointerException {
        if (phoneNumber == null || phoneNumber.equals(" ") || phoneNumber.isEmpty()) {
            throw new NullPointerException("Please enter your phone number!");
        }

        int count = 0;
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (isDigit(phoneNumber.charAt(i))) {
                count++;
            }
        }
        
        if (phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '1' && phoneNumber.length() == 11 && count == 11) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new PhoneNumberException("Please enter a valid phone number!");
        }
    }

    public void setNID(String NID) throws NIDException, NullPointerException {
        if (NID == null || NID.equals(" ") || NID.isEmpty()) {
            throw new NullPointerException("Please enter your NID number!");
        }

        int count = 0;
        for (int i = 0; i < NID.length(); i++) {
            if (isDigit(NID.charAt(i))) {
                count++;
            }
        }

        if (NID.length() == 11 && count == 11) {
            this.NID = NID;
        } else {
            throw new NIDException("Please enter a valid NID number!");
        }
    }

    public void setDateOfBirth(LocalDate dateOfBirth) throws NullPointerException {
        if (dateOfBirth.toString() == null || dateOfBirth.toString().isEmpty()) {
            throw new NullPointerException("Please choose a date");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNID() {
        return NID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return fullName + "," + address + "," + gender + "," + phoneNumber + "," + NID + "," + dateOfBirth ;
    }

}
