package dip.lab2.student.solution1;

import dip.lab2.*;

/**
 This is a low-level module. It depends upon the abstract superclass,TipCalculator, and as such,
 * must implement all of the abstract methods found there. This class has no direct interaction with the high-level
 * TipAssistant  class. Changing or removing this  class will not break anything in this program.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator extends TipCalc {
 
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + getMIN_BILL() + " and "
            + MAX_BILL;


    private double baseTipPerBag;
    private int bagCount;
 
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public double getTip() {
        double tip = 0.00; 

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + getGOOD_RATE());
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + getFAIR_RATE());
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + getPOOR_RATE());
                break;
        }

        return tip;
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

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
