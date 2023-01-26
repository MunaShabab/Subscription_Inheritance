import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class BasicSubscription{
    //instance variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private LocalDate subscriptionStartDate;

    //basic subscription rate
    private double basicSubscriptionRate =20;

    //class constructor

    public BasicSubscription(String argFirstName, String argLastName, String argAddress, String argCity, String argState, int argZipCode,LocalDate argSubscriptionStartDate ){

        this.setFirstName(argFirstName);
        this.setLastName(argLastName);
        this.setAddress(argAddress);
        this.setCity(argCity);
        this.setState(argState);
        this.setZipCode(argZipCode);
        this.setSubscriptionStartDate(argSubscriptionStartDate);

    }

    //set and get methods for the instance variables

    public void setFirstName (String arg){
        firstName=arg;
    }

    public void setLastName(String arg){
        lastName=arg;
    }

    public void setAddress(String arg){
        address=arg;
    }

    public void setCity(String arg){
        city=arg;
    }

    public void setState(String arg){
        state=arg;
    }

    public void setZipCode(int arg){
        zipCode=arg;
    }

    public void setSubscriptionStartDate(LocalDate arg){
        subscriptionStartDate=arg;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getAddress(){
        return address;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public int getZipCode(){
        return zipCode;
    }

    public LocalDate getSubscriptionStartDate(){
        return subscriptionStartDate;
    }

    //class methods

    public double CostOfRenewal(){
        return basicSubscriptionRate;
    }

    public LocalDate SubscriptionExpDate(LocalDate argStartDate){

        LocalDate expDate =argStartDate.plus(1,ChronoUnit.YEARS);

        return expDate;


    }


}