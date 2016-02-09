package dip.lab1.student.solution1;

/**

 * This is the module that sits between the low and high ones. All the different employee classes must implement this class and implement 
 * the getAnnualWages method, which make them dependent on this class, not the other way around. The HRService class must use this class
 * in order to access an employee's wages. However, the HR class only needs to know about this class, and never has to worry about what employee
 * classes we are using, so there is no dependence there. 
 * I would have included getBonus() in here as well, but the comments stated that bonus was for salaried employees, so it is 
 * there where is belongs.  Would probably included more in here in a real setting, like name, ssn, etc. 
 * @Jennifer 
 */
public abstract class Employee {
     public abstract double getAnnualWages();
}
