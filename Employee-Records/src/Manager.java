public class Manager extends Employee {
    private String department;

    public Manager(int id, String emName, int emAge, String job, double emSalary, String mDepart) {
        super(id, emName, emAge, job, emSalary);
        department = mDepart;
    }

    public void setDepartment(String theDepartment) {
        department = theDepartment;
    }

    public String getDepartment() {
        return department;
    }

//    public String toString(){
//        return;
//    }
}
