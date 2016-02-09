package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class in
 * any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
 // make different types of employee objects- these are the "Low-Level" modules. Their behavior depends on the 
 // abstract class that sits in the middle. 
        HourlyEmployee emp1 = new HourlyEmployee(10.50, 2020);
        SalariedEmployee emp2 = new SalariedEmployee(45000, 1250);
        SalariedEmployee emp3 = new SalariedEmployee(90000, 0);
        // using an array to test if this is really, acutally polymorphic
        Employee emp[] = {emp1, emp2, emp3};
      
        
        // This is the "high-level" module. It depends on the abstract class that sits in-between, but does not depend on the lower classes.
        // I could change any of the lower classes, and as long as they implement the abstract methods, any class will work. 
        HRService hr = new HRService();

     // Keeping this because this is new for me
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        // it does work, l
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Employee " + (i + 1) + " compensation:"
                    + nf.format(hr.getAnnualCompensationForEmployee(emp[i])));
        }

    }

}
