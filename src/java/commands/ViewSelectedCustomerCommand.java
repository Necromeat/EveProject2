/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import Shared.Account;
import Shared.Customer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Andrew
 */
public class ViewSelectedCustomerCommand extends TargetCommand {

    public ViewSelectedCustomerCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        String idStr= request.getParameter("custID");
        long idLong = Long.parseLong(idStr);
        Customer cust=servlets.Factory.getBankController().getCustomer(idLong);
        List<Account> acc = servlets.Factory.getBankController().getCustomer(idLong).getAccounts();
        
        request.setAttribute("customer", cust);
        request.setAttribute("account", acc);
        return super.execute(request); //To change body of generated methods, choose Tools | Templates.
    }
    
}
