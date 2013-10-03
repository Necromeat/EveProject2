/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import Shared.Account;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Andrew
 */
public class AccountHistoryCommand extends TargetCommand{

    public AccountHistoryCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        String idStr= request.getParameter("accID");
        long idLong = Long.parseLong(idStr);
        Account cust=servlets.Factory.getBankController().getAccount(idLong);
        request.setAttribute("account", cust);
        return super.execute(request); //To change body of generated methods, choose Tools | Templates.
    }
    
}
