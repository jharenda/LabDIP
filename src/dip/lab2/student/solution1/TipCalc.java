/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Jennifer
 */
public abstract class TipCalc {
// these were common between the two lower-level classes, so in the interst of dry, I moved them here to the class they share. 
// When we want to update these values, I only have to come here to change them and not find all the classes that use them.
// I am not sure if I like them being static finals- what if we want to override them for a specific situation? At the same time, this 
// protects them from being inappropriately changed, so... What I need is better requirements gathering. Would it be possbile for the rates to
    //ever differ in certian scenarios? If that was the case, then I would provide these defaults here, but make them over-rideable methods 
    // in case the subclasses ever needed to be able to change them.
    private static final double MIN_BILL = 0.00;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;
    // both lower-level classes shared the enum, so made sense to move it here.

    public static double getMIN_BILL() {
        return MIN_BILL;
    }

    public static double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public static double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public static double getPOOR_RATE() {
        return POOR_RATE;
    }

    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }

    public abstract void setServiceRating(ServiceQuality q);

    public abstract double getTip();

    public abstract ServiceQuality getServiceQuality();
}
