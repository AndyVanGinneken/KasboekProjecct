/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import BLL.Account;
import DAL.AccountDA;

/**
 *
 * @author Andy
 */
public class AccountService {
    private AccountDA da;
    
    
    public boolean checkLogin(String email, String password){
        Account account = da.getByEmail(email);
        if(account == null){
            
            return false;
        }
        else{ 
            return BCrypt.checkpw(password, account.getPassword());
        }
    }
        
    public void newUser(String username, String email, String password, boolean isAdmin){
        Account account = new Account();
        String pass = BCrypt.hashpw(password, BCrypt.genSalt());
        account.setUsername(username);
        account.setEmail(email);
        account.setPassword(pass);
        account.setIsAdmin(isAdmin);  
        da.saveAccount(account);
    }
    
    public void changePassword(Account account, String password){
        String pass = BCrypt.hashpw(password, BCrypt.genSalt());
        da.UpdatePassword(account.getId(), pass);
        
    }
}
   
