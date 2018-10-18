package dip.lab1.student.solution1;

public class SalariedEmployee implements Employee{

    private double annualSalary;
    private double annualBonus;

    public SalariedEmployee(double annualSalary, double annualBonus) {
        this.setAnnualSalary(annualSalary);
        this.setAnnualBonus(annualBonus);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public double getAnnualCompensation(){
        return this.annualSalary + this.annualBonus;
    }
}
