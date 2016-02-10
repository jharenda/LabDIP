package dip.lab1.student.solution1;

/**
 This is a low-level module. It depends upon the abstract superclass, Employee, and as such,
 * must implement the getAnuualWages() method. This class has no direct interaction with the high-level
 * HRService class. Changing or removing this  class will not break anything in this program.
 *
 * @Jennifer
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

     public double getAnnualBonus() {
        return annualBonus;
    }
     
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double getAnnualWages() {
     return annualSalary + annualBonus; 
    }

}
