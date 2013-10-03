/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import Shared.Customer;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Andrew
 */
public class AddCustomerCommand extends TargetCommand{

    public AddCustomerCommand(String target) {
          super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        System.out.println("Going into the if");     
        
        String cusName = request.getParameter("custName");
        String cusLastName = request.getParameter("custLastName");
        String custEmail = request.getParameter("custEmail");
           if(!request.getParameter("custName").isEmpty()){
             Customer cust = new Customer(cusName,cusLastName,custEmail);
             servlets.Factory.getBankController().addCustomer(cust);       
             request.setAttribute("command", "listCustomers");
           }
           
        return super.execute(request);  
           
        
        
        
        //We might need something here
         //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
