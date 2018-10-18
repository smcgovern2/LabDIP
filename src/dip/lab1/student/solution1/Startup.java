package dip.lab1.student.solution1;

import java.text.NumberFormat;
import java.util.ArrayList;


public class Startup {
    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new HourlyEmployee(10.50, 2020, 0));
        employees.add(new SalariedEmployee(45000, 1250));
        employees.add(new SalariedEmployee(90000, 0));

        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();


        // Test input/output..
        for(int i = 0; i<employees.size(); i++){
            System.out.println("Employee " + (i+1) + " annual compensation: " + nf.format(hr.getAnnualCompensationForEmployee(employees.get(i))));
        }
    }

}
