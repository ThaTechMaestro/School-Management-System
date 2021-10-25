package school.management.system;

/**
 * This class is responsible for keeping track of  students
 *      Names
 *      Id
 *      Fees
 *      Fees paid
 *
 *
 */


public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    // What possible actions can this class have
    // Check Name
    // Check Grade
    // Check Fees Paid
    // Check Total Fees

    /**
     *  A constructor to initialise our defined fields
     *  School fees is $30,000/year
     *  Initial fees paid by student is 0$
     * @param id - unique number for each student
     * @param name - name of a student
     * @param grade - Class a student belongs to
     */
    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.totalFees = 30000;
        this.id=id;
        this.name=name;
        this.grade=grade;



    }

    /**
     * It is used to set the grade
     * @param grade new grade of student entered
     */
    public void setGrade(int grade){
        this.grade = grade;

    }

    public int getGrade(){
        return grade;
    }

    /**
     * School stores the cummulative amount of fees paid by student
     * @param fees money paid by students
     */

    public void updateFeesPaid(int fees){
        feesPaid+=fees;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFees() {
        return totalFees;
    }
}
