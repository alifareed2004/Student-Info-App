package StudentAward;

public class FullTime extends Student {

    private static double fullTimeTuition= 18000;
    private double awardValue;


    public FullTime(int studentID, String firstName, String lastName, double GPA) {
        super(studentID, firstName, lastName, GPA);
    }

    public void award(double value){
        awardValue = value;
        System.out.println("Student " + firstName + " " + lastName + " GPA " + GPA + "| Awarded CAD" + awardValue);
    }

    @Override
    public double getAmountDue() {
        return fullTimeTuition - awardValue;
    }
    public boolean isFullTime(){
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Full-time \nAmount due: " + getAmountDue();
    }

}
