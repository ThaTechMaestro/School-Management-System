package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;

    /***
     *  Constructor for initialising our attributes when an object is created
     * @param id Teacher's id
     * @param name Name of the teacher
     * @param salary Salary of the teacher
     */
    public Teacher(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

}





