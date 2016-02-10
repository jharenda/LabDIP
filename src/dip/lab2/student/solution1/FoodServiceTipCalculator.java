package dip.lab2.student.solution1;

import dip.lab2.*;

/**
 This is a low-level module. It depends upon the abstract superclass, TipCalculator, and as such,
 * must implement all the abstract methods present there. This class has no direct interaction with the high-level
 * TipAssistant class. Changing or removing this  class will not break anything in this program.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    // need to un-lower case the var names 
      private static  double MIN_BILL = 0.00;
    private static double GOOD_RATE = 0.20;
    private static  double FAIR_RATE = 0.15;
    private static  double POOR_RATE = 0.10;
 
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;


    private double bill;
  
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

  
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

   
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}
