/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared;

import java.util.Collection;

/**
 *
 * @author andrew
 */
public interface EveController {
//    void addCustomer(Customer cust);
//    Customer getCustomer(long id);
//    Account getAccount(long id);
//    Collection<Account> getAccounts();
//    Collection<Customer> getCustomers();
    
        void AddBluePrintStandard(BluePrintStandard blue);
        BluePrintStandard getBluePrint(String BPName);
        
        void addProfitCalculation(BluePrintStandard blue,ProffitCalculator calc);
        ProffitCalculator getProffitCalculator(String BPName);
           
        Collection<BluePrintStandard> getBlueprints();

}
