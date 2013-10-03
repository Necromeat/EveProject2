/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared;

/**
 *
 * @author andrew
 */
public class ProffitCalculator {
    private double tritanium;
    private double pyerite;
    private double isogen;
    private double mexallon;
    private double noxcium;
    private double zydrine;
    private double megacyte;
    private double sale;
    
    private ProffitCalculator(){
        
    }
    
   public ProffitCalculator(double Sale,BluePrintStandard blue){
        this.sale = Sale;
        this.tritanium = blue.getTritaniumAmt();
        this.pyerite= blue.getPyeriteAmt();
        this.isogen = blue.getIsogenAmt();
        this.mexallon=blue.getMexallonAmt();
        this.noxcium=blue.getNoxciumAmt();
        this.zydrine=blue.getZydrineAmt();
        this.megacyte=blue.getMegacyteAmt();
        
    }

    
   
    
    public double getTritaniumCost(){
        return tritanium*Minerals.getTritanium();
    }
    
    public double getIsogenCost(){
        return isogen*Minerals.getIsogen();
    }

    public double getPyeriteCost() {
        return pyerite*Minerals.getPyerite();
    }

    public double getMexallonCost() {
        return mexallon*Minerals.getMexallon();
    }

    public double getNoxciumCost() {
        return noxcium*Minerals.getNoxcium();
    }

    public double getZydrineCost() {
        return zydrine*Minerals.getZydrine();
    }

    public double getMegacyteCost() {
        return megacyte*Minerals.getMegacyte();
    }
    
    
    
    
    
    public double getProfitTotal(){
        double temp= sale-(getTritaniumCost()+getIsogenCost()+getPyeriteCost()+getMexallonCost()+getNoxciumCost()+getZydrineCost()+getMegacyteCost());
        return temp;
    }
    
}
