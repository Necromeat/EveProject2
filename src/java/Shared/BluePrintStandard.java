/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrew
 */
public class BluePrintStandard {
    private List<BluePrintStandard> listOfBluePrints = new ArrayList();
    private int tritaniumAmt;
    private int pyeriteAmt;
    private int isogenAmt;
    private int mexallonAmt;
    private int noxciumAmt;
    private int zydrineAmt;
    private int megacyteAmt;
    private String name;
    public BluePrintStandard(){
        
    }
    
    public BluePrintStandard(String name,int trit,int pyr,int iso,int mexallon,int noxcium,int zydrine, int mega){
        this.tritaniumAmt = trit;
        this.pyeriteAmt= pyr;
        this.isogenAmt = iso;
        this.mexallonAmt=mexallon;
        this.noxciumAmt=noxcium;
        this.zydrineAmt=zydrine;
        this.megacyteAmt=mega;
        this.name = name;
    
    }

    public String getName() {
        return name;
    }
    
    

    public void setListOfBluePrints(List<BluePrintStandard> listOfBluePrints) {
        this.listOfBluePrints = listOfBluePrints;
    }

    
    public List<BluePrintStandard> getListOfBluePrints() {
        return listOfBluePrints;
    }

    public int getTritaniumAmt() {
        return tritaniumAmt;
    }

    public int getPyeriteAmt() {
        return pyeriteAmt;
    }

    public int getIsogenAmt() {
        return isogenAmt;
    }

    public int getMexallonAmt() {
        return mexallonAmt;
    }

    public int getNoxciumAmt() {
        return noxciumAmt;
    }

    public int getZydrineAmt() {
        return zydrineAmt;
    }

    public int getMegacyteAmt() {
        return megacyteAmt;
    }

    @Override
    public String toString() {
        return "BluePrintStandard{"+"name"+getName() + "tritanium=" + tritaniumAmt + ", pyerite=" + pyeriteAmt + ", isogen=" + isogenAmt + ", mexallon=" + mexallonAmt + ", noxcium=" + noxciumAmt + ", zydrine=" + zydrineAmt + ", megacyte=" + megacyteAmt + '}';
    }
    
    
}
