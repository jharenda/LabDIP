package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @Jennifer 
 */
public class HRService {
    /** 
   
     * 
     * 
     * I really liked the idea of an enum here, but after I couldn't figure out how to get it to work how I wanted
     * and looking at the solution, I decided to abandon it. I do think that this solution works well, but I still would
     * like to learn about when it might be appropriate to use an enum and how to use it. I knew that there had to be a 
     * high- level class here, but I am surprised that it took me a bit of thought to decide what exactly it was supposed to do. 
     * I was probably thinking too big based upon the very limited scoop of this program. Once I clued into the fact that all
     * we could do here is get any type of employee's wages, this whole thing was a breeze. 
     */


    /**
     * Alternatively to the above, we could use an enum. Does this improve
     * type safety? . 
     * @param e
     */

    public double getAnnualCompensationForEmployee(Employee e)
    {
        double annualCompensation = 0;
  annualCompensation = e.getAnnualWages();
        return annualCompensation;
    }
    
    
}
