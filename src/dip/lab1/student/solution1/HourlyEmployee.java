package dip.lab1.student.solution1;

/**
 This is a low-level module. It depends upon the abstract superclass, Employee, and as such,
 * must implement the getAnuualWages() method. This class has no direct interaction with the high-level
 * HRService class. Changing or removing this  class will not break anything in this program.
 *
 * @Jennifer
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;
   

 // do not want a default- need to force passing in correct data here. 
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    @Override
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

 
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }
}
