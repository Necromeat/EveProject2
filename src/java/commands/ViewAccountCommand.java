/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import Shared.Account;
import Shared.Customer;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Andrew
 */
public class ViewAccountCommand extends TargetCommand{

    public ViewAccountCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        String idStr= request.getParameter("accID");
        String cusIdStr=request.getParameter("cusID");
        long idLong = Long.parseLong(idStr);
        long custidLong = Long.parseLong(cusIdStr);
        Account acc=servlets.Factory.getBankController().getAccount(idLong);
        Customer cust = servlets.Factory.getBankController().getCustomer(custidLong);
        request.setAttribute("account", acc);
        request.setAttribute("customer", cust);
        return super.execute(request); //To change body of generated methods, choose Tools | Templates.
    }
    
}
