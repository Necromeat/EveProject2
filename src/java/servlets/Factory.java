/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import commands.AccountHistoryCommand;
import commands.AddCustomerCommand;
import commands.TargetCommand;
import commands.Command;
import commands.CustomerListCommand;
import commands.MyPageCommand;
import commands.ViewAccountCommand;
import commands.ViewListOfAccountsCommand;
import commands.ViewSelectedCustomerCommand;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author hsty
 */
public class Factory {
    
    /*This class is singleton, only one instance of this class excists*/
    private static Factory instance = new Factory();
    
    private Map<String, Command> commands = new HashMap<>();
 
    private Factory()
    {
        commands.put("main", new TargetCommand("/main.jsp"));
        commands.put("mypage", new MyPageCommand("/mypage.jsp"));
        commands.put("addCustomer", new AddCustomerCommand("/addCustomer.jsp"));
        commands.put("listCustomers", new CustomerListCommand("/listCustomers.jsp"));
        commands.put("ViewSelectedCustomer", new ViewSelectedCustomerCommand("/ViewSelectedCustomer.jsp"));
        commands.put("listAccounts", new ViewListOfAccountsCommand("/listAccounts.jsp"));
        commands.put("ViewAccount", new ViewAccountCommand("/ViewAccount.jsp"));
        commands.put("AccountHistory", new AccountHistoryCommand("/AccountHistory.jsp"));
//        commands.put("AddCustomerToList", new AddCustomerCommand(""));
    }

    public static Factory getInstance() {
       return instance;
    }
//    
//    public static BankDataController getBankController(){
//        return DummyBankController.getInstance();
//    }

    public Command getCommand(String cmdStr) {
        if(cmdStr == null)
            cmdStr = "main";
        return commands.get(cmdStr);
    }
    
}
