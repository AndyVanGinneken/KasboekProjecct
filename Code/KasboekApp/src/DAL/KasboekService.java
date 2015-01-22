/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.*;
import java.util.List;
import javax.persistence.*;


/**
 *
 * @author Andy
 */
public class KasboekService {
            
        public void saveKas(Kas kas){ 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        if(kas.getId()!= null)
        {
            Kas toUpdate = em.find(Kas.class, kas.getId());
            transaction.begin();
            
            toUpdate.setEenCenten(kas.getEenCenten());
            toUpdate.setTweeCenten(kas.getTweeCenten());
            toUpdate.setVijfCenten(kas.getVijfCenten());
            toUpdate.setTienCenten(kas.getTienCenten());
            toUpdate.setTwintigCenten(kas.getTwintigCenten());
            toUpdate.setVijftigCenten(kas.getVijftigCenten());
            toUpdate.setEenEuros(kas.getEenEuros());
            toUpdate.setTweeEuros(kas.getTweeEuros());
            toUpdate.setVijfEuros(kas.getVijfEuros());
            toUpdate.setTienEuros(kas.getTienEuros());
            toUpdate.setTwintigEuros(kas.getTwintigEuros());
            toUpdate.setVijftigEuro(kas.getVijftigEuro());
            toUpdate.setHonderdEuros(kas.getHonderdEuros());
            
            transaction.commit();
            
                    
        
        }
        else{
        transaction.begin();
        em.persist(kas);
        transaction.commit();
        }

        }
        
        public void saveRol(Rol rol){ 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        if(rol.getId()!= null)
        {
            Rol toUpdate = em.find(Rol.class, rol.getId());
            transaction.begin();
            toUpdate.setEenCent(rol.getEenCent());
            toUpdate.setTweeCent(rol.getTweeCent());
            toUpdate.setVijfCent(rol.getVijfCent());
            toUpdate.setTienCent(rol.getTienCent());
            toUpdate.setTwintigCent(rol.getTwintigCent());
            toUpdate.setVijftigCent(rol.getVijftigCent());
            toUpdate.setEenEuro(rol.getEenEuro());
            toUpdate.setTweeEuro(rol.getTweeEuro());            
            transaction.commit();
        }
        else{
        transaction.begin();
        em.persist(rol);
        transaction.commit();
        }
        }
        
        public void saveKasboek(Kasboek kasboek){ 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        if(kasboek.getId() != null)
        {
            Kasboek toUpdate = em.find(Kasboek.class,kasboek.getId());
            transaction.begin();
            toUpdate.setCommentaar(kasboek.getCommentaar());
            toUpdate.setEindKas(kasboek.getEindKas());
            toUpdate.setRolletjes(kasboek.getRolletjes());
            toUpdate.setUitKas(kasboek.getUitKas());
            transaction.commit();
            
        }
        else{
        transaction.begin();
        em.persist(kasboek);
        transaction.commit();
        }
        }
        
        public List<Kasboek> getAllKasboeken(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        List<Kasboek> kasboeken =  em.createNamedQuery("Kasboek.findAll",Kasboek.class).getResultList();
        return kasboeken;
        }
        
        public List<Kasboek> FindByYearAndMonth(int year, int month){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
            EntityManager em = emf.createEntityManager();
            // jpa kent WHERE YEAR(k.datum) niet dus daarom FUNC('YEAR',k.datum)
            Query q =  em.createNamedQuery("Kasboek.findByDatum",Kasboek.class);
            q.setParameter("jaar", year);
            q.setParameter("maand", month);
            List<Kasboek> kasboeken = q.getResultList();
            return kasboeken;
        }
        
        public Kasboek GetById(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KasboekPU");
        EntityManager em = emf.createEntityManager();
        Kasboek kasboek = em.find(Kasboek.class, id );
        return kasboek;
        }
        
}
