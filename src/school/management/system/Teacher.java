package school.management.system;

public class Teacher {

    private int salaryEarned;
    private int id;
    private String name;
    private int salary;

    @Override
    public String toString() {
        return "Name of the teacher "+name+
                " Total salary so far "+salaryEarned;
    }

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receivedSalary(int salary){
        salaryEarned += salary;
        School.updateTotelMoneySpent(salary);
    }
}
