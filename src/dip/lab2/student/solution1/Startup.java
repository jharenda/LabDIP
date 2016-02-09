package dip.lab2.student.solution1;

import java.text.NumberFormat;

/**
 * It seems to work?
 *
 * @author Jennifer
 */
public class Startup {

    public static void main(String[] args) {
        TipCalc tip1 = new FoodServiceTipCalculator(TipCalc.ServiceQuality.valueOf("GOOD"), 20.00);
        TipCalc tip2 = new FoodServiceTipCalculator(TipCalc.ServiceQuality.valueOf("POOR"), 113.30);

        // Tried passing in a invalid rating- enum really does work
        TipCalc tip3 = new BaggageServiceTipCalculator(TipCalc.ServiceQuality.valueOf("FAIR"), 7);
        TipCalc tip4 = new BaggageServiceTipCalculator(TipCalc.ServiceQuality.valueOf("FAIR"), 1);

        TipAssistant tipAssistant = new TipAssistant();
// I really like this number formatter. Can't believe I didn't know about it. 
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        TipCalc[] tips = {tip1, tip2, tip3, tip4};
        for (int i = 0; i < tips.length; i++) {
            System.out.println("The tip would be:  " + nf.format(tipAssistant.calculateTip(tips[i])));
        }

    }

}
