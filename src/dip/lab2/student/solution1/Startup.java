package dip.lab2.student.solution1;

import java.text.NumberFormat;

/**
 * It seems to work?
 *
 * @author Jennifer
 */
public class Startup {

    public static void main(String[] args) {

//        TipCalculator tip1 = new FoodServiceTipCalculator(ServiceQuality.GOOD, 120.90);
//        TipCalculator tip5 = new FoodServiceTipCalculator(ServiceQuality.FAIR, 20.00);
//        TipCalculator tip2 = new FoodServiceTipCalculator(ServiceQuality.POOR, 113.30);
//
//        // Tried passing in a invalid rating- enum really does work
//        TipCalculator tip3 = new BaggageServiceTipCalculator(ServiceQuality.FAIR, 7);
//        TipCalculator tip4 = new BaggageServiceTipCalculator(ServiceQuality.FAIR, 1);




        // pass via cons
        TipCalculator calc = new FoodServiceTipCalculator(ServiceQuality.GOOD, 120.90);
       
        
        TipService mgr = new TipService(calc);
        double amt = mgr.getTip();
        System.out.println(amt);
        
        
        
        
        
        

        // TipService tipAssistant = new TipService();
// I really like this number formatter. Can't believe I didn't know about it. 
        //NumberFormat nf = NumberFormat.getCurrencyInstance();
        //  TipCalculator[] tips = {tip1, tip2, tip3, tip4, tip5};
        //  for (int i = 0; i < tips.length; i++) {
        //  System.out.println("The tip would be:  " + nf.format(tipAssistant.calculateTip(tips[i])));
    }

}
