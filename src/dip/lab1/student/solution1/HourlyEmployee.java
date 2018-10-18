package dip.lab1.student.solution1;

public class HourlyEmployee implements Employee {

    private double totalHoursWorkedForYear;
    private double hourlyWage;
    private double annualBonus;


    public HourlyEmployee(double totalHoursWorked, double hourlyWage, double annualBonus){
        this.setTotalHoursWorkedForYear(totalHoursWorked);
        this.setHourlyWage(hourlyWage);
        this.setAnnualBonus(annualBonus);
    }

    public double getTotalHoursWorkedForYear() {
        return totalHoursWorkedForYear;
    }

    public void setTotalHoursWorkedForYear(double totalHoursWorkedForYear) {
        this.totalHoursWorkedForYear = totalHoursWorkedForYear;
    }


    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }


    public double getAnnualBonus() {
        return annualBonus;
    }


    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }


    public double getAnnualWages() {
        return this.hourlyWage * this.totalHoursWorkedForYear;
    }

    @Override
    public double getAnnualCompensation(){
        return getAnnualWages() + this.annualBonus;
    }
}
