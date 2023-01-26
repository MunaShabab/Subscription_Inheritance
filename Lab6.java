import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Lab6{
    public static void main (String [] args){
        //create a LocalDateTime object and assign it to a LocalDate object
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate date1=currentTime.toLocalDate();
        LocalDate date2=date1.plus(1, ChronoUnit.MONTHS);
        LocalDate date3=date1.plus(5,ChronoUnit.MONTHS);
        //create a BasicSubscription object
        BasicSubscription subscription1= new BasicSubscription("Steve","Hall","221 Woods Dr.","Parkview","OH",44321, date1);

        //create a StudentSubscription object and test it
        StudentSubscription subscription2= new StudentSubscription("Holly","Marks","1290 Porter Rd.","London","PA",52329,date2,"University of Pittsburgh",245783);

        //create a PremiumSubscription object and test it
        PremiumSubscription subscription3=new PremiumSubscription("Madison","Lucas","234 Oak Ln","Richmond","VA",54978,date3);

        //display info about the object 
        System.out.println(subscription1.getFirstName()+ " "+subscription1.getLastName()+ " : Subscription expires "+
        subscription1.SubscriptionExpDate(subscription1.getSubscriptionStartDate())+". Cost to Renew: $"+ String.format("%.2f",subscription1.CostOfRenewal()));
        System.out.println("****************************************************************");
        System.out.println(subscription2.getFirstName()+ " "+subscription2.getLastName()+ " : Subscription expires "+
        subscription2.SubscriptionExpDate(subscription2.getSubscriptionStartDate())+". Cost to Renew: $"+ String.format("%.2f",subscription2.CostOfRenewal()));
        System.out.println("****************************************************************");
        System.out.println(subscription3.getFirstName()+ " "+subscription3.getLastName()+ " : Subscription expires "+
        subscription3.SubscriptionExpDate(subscription3.getSubscriptionStartDate())+". Cost to Renew: $"+ String.format("%.2f",subscription3.CostOfRenewal()));
    }
} 