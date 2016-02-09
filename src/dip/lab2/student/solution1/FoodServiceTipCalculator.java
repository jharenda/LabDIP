package dip.lab2.student.solution1;

import dip.lab2.*;

/**
 This is a low-level module. It depends upon the abstract superclass, TipCalculator, and as such,
 * must implement all the abstract methods present there. This class has no direct interaction with the high-level
 * TipAssistant class. Changing or removing this  class will not break anything in this program.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator extends TipCalc {
 
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + getMIN_BILL();


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
                tip = bill * getGOOD_RATE();
                break;
            case FAIR:
                tip = bill * getFAIR_RATE();
                break;
            case POOR:
                tip = bill * getPOOR_RATE();
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < getMIN_BILL()) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    @Override
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}
