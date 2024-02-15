import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    //customerID can be used for userID?
    private int customerID;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String userID;
    private int pin;
    //Pin can be hashed when keying in and checking?
    private String gender;
    private List<Account> accounts;
    private List<Insurance> insurances;
    private List<CreditCard> creditCards;

}
