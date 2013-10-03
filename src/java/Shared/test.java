/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andrew
 */
public class test implements EveController{
    
        
     private Map<String,BluePrintStandard> BPS = new HashMap(); 
     private Map<String,ProffitCalculator> PrCl = new HashMap(); 
    
    
    private static test instance = new test();

    
    private test(){  
        Minerals.setTritanium(1.0);
        Minerals.setIsogen(2.2);
        Minerals.setMegacyte(2.3);
        Minerals.setMexallon(4.0);
        Minerals.setZydrine(5.0);
        Minerals.setNoxcium(4.5);
        Minerals.setPyerite(7.0);
        BluePrintStandard bp = new BluePrintStandard("Test",100,100,100,100,100,100,100);
        ProffitCalculator pc = new ProffitCalculator(500.0,bp);
        BPS.put(bp.getName(), bp);
        PrCl.put(bp.getName(), pc);
        
    }
    
    public static test getInstance(){
        return instance;
    }
    
    @Override
    public void AddBluePrintStandard(BluePrintStandard blue) {
        BPS.put(blue.getName(), blue);
        
    }

    @Override
    public BluePrintStandard getBluePrint(String BPName) {
      return BPS.get(BPName);
    }

    @Override
    public void addProfitCalculation(BluePrintStandard blue,ProffitCalculator calc) {
        
        PrCl.put(blue.getName(), calc);
        
    }

    @Override
    public ProffitCalculator getProffitCalculator(String BPCalc) {
        return PrCl.get(BPCalc);
    }

    @Override
    public Collection<BluePrintStandard> getBlueprints() {
        return BPS.values();
    }
   
}
