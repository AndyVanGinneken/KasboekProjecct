/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasboekdesktop;

import BLL.*;
import BLL.Rol;
import DAL.KasboekService;
import java.util.Date;

/**
 *
 * @author Andy
 */
public class KasboekDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KasboekService ks = new KasboekService();
        Kas begin = new Kas(1, 2, 3, 3, 4, 8, 6, 5, 7, 3, 8, 2, 1);
        Kas eind = new Kas(2, 8, 5, 4, 3, 8, 3, 5, 4, 8, 9, 6, 4);
        Rol rol = new Rol();
        rol.setTweeEuro(1);
        Kas uit = new Kas();
        uit.setHonderdEuros(1);
        Kasboek k  = new Kasboek(new Date(), "andy", "winterbunker", begin, null);
        
        ks.saveRol(rol);
        ks.saveKas(eind);
        ks.saveKas(begin);
        ks.saveKas(uit);
        ks.saveKasboek(k);
        
        
        System.out.println("" + k.omzet());
        
        
    }
    
}
