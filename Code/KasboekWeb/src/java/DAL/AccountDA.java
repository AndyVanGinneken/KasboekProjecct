/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Account;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Andy
 */
public class AccountDA {
    
    public static Account getByEmail(String email){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        Account account = em.find(Account.class, email);
        return account;
        }
    
//        //nog niet nodig
//        public Account getByUsername(String username){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
//        EntityManager em = emf.createEntityManager();
//        Account account = em.find(Account.class, username);
//        return account;
//        }
    
     public static void saveAccount(Account account){ 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        if(account.getId()== null)
        {
            transaction.begin();
            em.persist(account);
            transaction.commit();
            
        }
        else{
        Account toUpdate = em.find(Account.class, account.getId());
            transaction.begin();
            toUpdate.setEmail(account.getEmail());
            toUpdate.setUsername(account.getUsername());
            toUpdate.setIsAdmin(account.getIsAdmin());
            transaction.commit();
        }
        }
     public static void deleteAccount(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        Account account = em.find(Account.class, id);
        transaction.begin();
        em.remove(account);
        transaction.commit();
        
     }
    public static void UpdatePassword(int id, String password){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        Account account = em.find(Account.class, id);
        transaction.begin();
        account.setPassword(password);
        transaction.commit();
     }
        public static List<Account> getAllAccounts(boolean isAdmin){
        if(isAdmin){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        List<Account> account =  em.createNamedQuery("Account.findAll",Account.class).getResultList();
        return account;
        }
        else{
            return null;
        }
        }
}
