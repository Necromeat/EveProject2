/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared;

/**
 *
 * @author andrew
 */
public class MainTest {
    public static void main(String[] args) {
        
        System.out.println(test.getInstance().getBlueprints().toString());
        System.out.println(""+test.getInstance().getProffitCalculator("Test").getProfitTotal());
    }
}
