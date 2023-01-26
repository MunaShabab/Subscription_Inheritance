import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class PremiumSubscription extends BasicSubscription{
    //class constructor
    public PremiumSubscription(String argFirstName, String argLastName, String argAddress, String argCity, String argState, int argZipCode,LocalDate argSubscriptionStartDate ){
        super(argFirstName, argLastName,argAddress,argCity,argState,argZipCode,argSubscriptionStartDate);
    }

    //methods override

    public double CostOfRenewal(){
        double cost;
        cost=2.5 *super.CostOfRenewal();
        return cost;
    }

    public LocalDate SubscriptionExpDate(LocalDate argStartDate){
        LocalDate expDate=argStartDate.plus(3,ChronoUnit.YEARS);
        return expDate;
    }
}