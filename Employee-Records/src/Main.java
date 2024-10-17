public class Main {
    public static void main(String[] args) {

        Employee newEmployee = new Employee(101, "John Doe", 30, "Engineer", 80000);
        Manager newManager = new Manager(102, "Jane Smith", 40, "Manager", 120000, "IT");

        newManager.setDepartment("HR");

        SalesPerson sales = new SalesPerson(103, "Emily Johnson", 25, "SalesPerson", 60000, 500000);
        sales.setSalesTarget(700000);

        // Printing out the details
        System.out.println("Employee ID: " + newEmployee.getEmployeeId() + ", Name: " + newEmployee.getName());
        System.out.println("Manager Department: " + newManager.getDepartment());
        System.out.println("SalesPerson Sales Target: " + sales.getSalesTarget());
    }


}