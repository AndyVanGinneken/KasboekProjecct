/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

import BLL.Account;
import java.util.List;

/**
 *
 * @author Andy
 */
public class AccountList {
    
    private List<Account> accountList;

    public AccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    /**
     * @return the accountList
     */
    public List<Account> getAccountList() {
        return accountList;
    }

    /**
     * @param accountList the accountList to set
     */
    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
    
}
