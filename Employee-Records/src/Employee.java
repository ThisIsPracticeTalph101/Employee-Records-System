public class Employee {
    private int employeeId;
    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    public Employee(int id, String emName, int emAge, String job, double emSalary){
        employeeId = id;
        name = emName;
        age = emAge;
        jobTitle = job;
        salary = emSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }
}
