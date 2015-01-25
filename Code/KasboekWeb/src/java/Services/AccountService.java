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
    
    
    public static boolean checkLogin(String email, String password){
        Account account = AccountDA.getByEmail(email);
        if(account == null){
            
            return false;
        }
        else{ 
            return BCrypt.checkpw(password, account.getPassword());
        }
    }
        
    public static String encryptPass(String password){
        
        String pass = BCrypt.hashpw(password, BCrypt.gensalt());
          
        return pass;
    }
    
    public static void changePassword(Account account, String password){
        String pass = BCrypt.hashpw(password, BCrypt.gensalt());
        AccountDA.UpdatePassword(account.getId(), pass);
        
    }
}
   
