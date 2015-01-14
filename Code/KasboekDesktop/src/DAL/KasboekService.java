/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Andy
 */
public class KasboekService {
            
        public void saveKas(Kas kas){ 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(kas);
        transaction.commit();
        }
        
        public void saveRol(Rol rol){ 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(rol);
        transaction.commit();
        }
        
        public void saveKasboek(Kasboek kasboek){ 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(kasboek);
        transaction.commit();
        }
        
        
        
}
