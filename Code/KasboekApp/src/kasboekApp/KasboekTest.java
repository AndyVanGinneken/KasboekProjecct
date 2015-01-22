/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasboekApp;

import BLL.*;
import DAL.KasboekService;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Andy
 */
public class KasboekTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KasboekService ks = new KasboekService();
//        //aanmaken van classes
//        Kas begin = new Kas(1, 2, 3, 3, 4, 8, 6, 5, 7, 3, 8, 2, 1);
//        Kas eind = new Kas();
//        eind.setEenCenten(4);
//        Rol rol = new Rol();
//        rol.setTweeEuro(1);
//        Kas uit = new Kas();
//        uit.setHonderdEuros(1);
//        Kasboek k  = new Kasboek(new Date(), "andy", "winterbunker", begin, null);
//        
//        
//        // test insert (save)
//        ks.saveKas(begin);
//        ks.saveKas(eind);
//        ks.saveKas(uit);
//        ks.saveKasboek(k);
        
        
//        // Test Omzet, update (save), getAllKasboeken 
//        System.out.println("" + k.omzet()+ " " + eind.getEenCenten());
//        eind.setEenCenten(20);
//        ks.saveKas(eind);
//        k.setUitKas(uit);
//        ks.saveKasboek(k);
//        System.out.println("" + k.omzet());
//        List<Kasboek> kasboeken = ks.getAllKasboeken();
//        for(Kasboek kasb : kasboeken) {
//            System.out.println("" + kasb.getDatum()+" " +kasb.getAv() + " " + kasb.omzet() );
//        }
        
        
//        // test GetById
//        Kasboek kasbo = ks.GetById(1);
//        System.out.println("" + kasbo.getCommentaar());
//        Kas kass = kasbo.getBeginKas();
//        System.out.println(""  + kass.getVijfCenten());
        
//        // test FindByYearAndMonth
//        List<Kasboek> kasboeken=ks.FindByYearAndMonth(2015,1);
//        for(Kasboek kasb : kasboeken) {
//            System.out.println("" + kasb.getDatum()+" " +kasb.getAv() + " " + kasb.omzet() );
//         }
//        
    }
    
}
