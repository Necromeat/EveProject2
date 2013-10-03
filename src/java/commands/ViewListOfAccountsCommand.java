/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import Shared.Account;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import servlets.Factory;

/**
 *
 * @author Andrew
 */
public class ViewListOfAccountsCommand extends TargetCommand{

    public ViewListOfAccountsCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
         Collection<Account> accs = Factory.getBankController().getAccounts();
        request.setAttribute("accounts", accs);
        return super.execute(request); //To change body of generated methods, choose Tools | Templates.
    }
    
}
