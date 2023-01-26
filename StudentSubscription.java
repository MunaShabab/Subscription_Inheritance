import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class StudentSubscription extends BasicSubscription{
    //instance variables 
    private String schoolName;
    private int studentID;

    //class constructor
    public StudentSubscription(String argFirstName, String argLastName, String argAddress, String argCity, String argState, int argZipCode,LocalDate argSubscriptionStartDate, String argSchoolName,int argStudentID){
        super(argFirstName, argLastName,argAddress,argCity,argState,argZipCode,argSubscriptionStartDate);
        this.setSchoolName(argSchoolName);
        this.setStudentID(argStudentID);
    }

    //set and get methods for the instance variables
    public void setSchoolName(String arg){
        schoolName=arg;
    }

    public void setStudentID(int arg){
        studentID=arg;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public int getStudentID(){
        return studentID;
    }

    //CostOfRenewal override
    public double CostOfRenewal(){
        double cost;
        cost=.75 * super.CostOfRenewal();
        return cost;
    }


}