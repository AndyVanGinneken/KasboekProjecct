/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andy
 */
@Entity
@Table(name = "kasboek")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kasboek.findAll", query = "SELECT k FROM Kasboek k"),
    @NamedQuery(name = "Kasboek.findByDatum", query = "SELECT k FROM Kasboek k WHERE FUNC('YEAR', k.datum) =:jaar AND FUNC('MONTH', k.datum) = :maand ORDER BY k.datum"),
    })
public class Kasboek implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Datum")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Basic(optional = false)
    @Column(name = "AV")
    private String av;
    @Basic(optional = true)
    @Column(name = "Commentaar")
    private String Commentaar;
    @JoinColumn(name = "BeginKas", referencedColumnName = "Id")
    @OneToOne(optional = false)
    private Kas beginKas;
    @JoinColumn(name = "EindKas", referencedColumnName = "Id")
    @OneToOne(optional = true)
    private Kas eindKas;
    @JoinColumn(name = "Rolletjes", referencedColumnName = "Id")
   @OneToOne(optional = true)
    private Rol rolletjes;
    @JoinColumn(name = "UitKas", referencedColumnName = "Id")
    @OneToOne(optional = true)
    private Kas uitKas;

    public Kasboek() {
    }

    public Kasboek(Date datum, String av, String Commentaar) {
        this.datum = datum;
        this.av = av;
        this.Commentaar = Commentaar;
    }

    public Kasboek(Date datum, String av, String Commentaar, Kas beginKas, Kas eindKas, Rol rolletjes, Kas uitKas) {
        this.datum = datum;
        this.av = av;
        this.Commentaar = Commentaar;
        this.beginKas = beginKas;
        this.eindKas = eindKas;
        this.rolletjes = rolletjes;
        this.uitKas = uitKas;
    }

    public Kasboek(Date datum, String av, String Commentaar, Kas beginKas, Kas eindKas) {
        this.datum = datum;
        this.av = av;
        this.Commentaar = Commentaar;
        this.beginKas = beginKas;
        this.eindKas = eindKas;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getAv() {
        return av;
    }

    public void setAv(String av) {
        this.av = av;
    }

    public Kas getBeginKas() {
        return beginKas;
    }

    public void setBeginKas(Kas beginKas) {
        this.beginKas = beginKas;
    }

    public Kas getEindKas() {
        return eindKas;
    }

    public void setEindKas(Kas eindKas) {
        this.eindKas = eindKas;
    }

    public Rol getRolletjes() {
        return rolletjes;
    }

    public void setRolletjes(Rol rolletjes) {
        this.rolletjes = rolletjes;
    }

    public Kas getUitKas() {
        return uitKas;
    }

    public void setUitKas(Kas uitKas) {
        this.uitKas = uitKas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kasboek)) {
            return false;
        }
        Kasboek other = (Kasboek) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Kasboek[ id=" + id + " ]";
    }
    
    public double totaalBegin(){
        if(rolletjes!= null){
        return round(beginKas.total()+ rolletjes.total(),2);
        }
        return round(beginKas.total(),2);
    }
    
    public double totaalEind(){
        if(uitKas != null){
            return round(eindKas.total()+ uitKas.total(),2);
        }
        return round(eindKas.total(),2);
        
    }
    public double omzet(){
        return round(totaalEind()- totaalBegin(),2);
    }

    /**
     * @return the Commentaar
     */
    public String getCommentaar() {
        return Commentaar;
    }

    /**
     * @param Commentaar the Commentaar to set
     */
    public void setCommentaar(String Commentaar) {
        this.Commentaar = Commentaar;
    }
    
    public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
}
}
