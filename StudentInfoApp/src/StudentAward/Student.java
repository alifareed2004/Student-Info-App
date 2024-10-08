package StudentAward;

public abstract class Student implements Comparable<Student> {
    int studentID;
    String firstName, lastName;
    double GPA;
    double tuition;

    public Student(int studentID, String firstName, String lastName, double GPA){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public double getGPA(){
        return GPA;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getStudentID(){
        return studentID;
    }
    public double getTuition(){
        return tuition;
    }
    public void setTuition(double tuition) {
        this.tuition = tuition;
    }
    public abstract double getAmountDue();
    public abstract boolean isFullTime();

    public int compareTo(Student other){
    	final int EQUAL = 0;
    	final int LESS = -1;
    	final int MORE = 1;
    	
    	//Compare their GPAs
        if (this.GPA > other.GPA) {
        	return MORE;
        } else if (this.GPA < other.GPA) {
        	return LESS;
        } else {
        	return EQUAL;
        }
    }

    @Override
    public String toString() {
        String output = "studentID=" + studentID + ", firstName='" + firstName + "', lastName='" + lastName + ", GPA=" + GPA + ", ";
        
        return output;
    }
}
