package constructors;

public class Job {

    public Job(){

    }

    public Job(String message){
        System.out.println("Inside constructor of Job Class for: " + message);
    }

    public Job(String jobTypeP, double salaryP, boolean isHighlyPaidP){
        jobType = jobTypeP;
        salary = salaryP;
        isHighlyPaid = isHighlyPaidP;
    }

    String jobType;
    double salary;
    boolean isHighlyPaid;

    public void getPaid(double salary){
        System.out.println(jobType + " got paid " + salary);
    }

    public void takeVacation(){
        System.out.println(jobType + " is on vacation.");
    }

}
