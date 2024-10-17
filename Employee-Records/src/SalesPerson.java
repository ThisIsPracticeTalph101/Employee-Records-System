public class SalesPerson extends Employee {
    private double salesTarget;

    public SalesPerson(int id, String emName, int emAge, String job, double emSalary, double target) {
        super(id, emName, emAge, job, emSalary);
        salesTarget = target;

    }

    public double getSalesTarget() {
        return salesTarget;
    }

    public void setSalesTarget(double salesTarget) {
        this.salesTarget = salesTarget;
    }
}
