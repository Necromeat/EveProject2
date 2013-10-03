/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import Shared.Customer;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import servlets.*;
/**
 *
 * @author Andrew
 */
public class CustomerListCommand extends TargetCommand {

    public CustomerListCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
       Collection<Customer> cust = Factory.getBankController().getCustomers();
       request.setAttribute("customers", cust);
        return super.execute(request); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
