/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author Andy
 */
@Entity
@Table(name = "kas")
@XmlRootElement

    @NamedQuery(name = "Kas.findById", query = "SELECT k FROM Kas k WHERE k.id = :id")
public class Kas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "HonderdEuros")
    private int honderdEuros;
    @Basic(optional = false)
    @Column(name = "VijftigEuro")
    private int vijftigEuro;
    @Basic(optional = false)
    @Column(name = "TwintigEuros")
    private int twintigEuros;
    @Basic(optional = false)
    @Column(name = "TienEuros")
    private int tienEuros;
    @Basic(optional = false)
    @Column(name = "VijfEuros")
    private int vijfEuros;
    @Basic(optional = false)
    @Column(name = "TweeEuros")
    private int tweeEuros;
    @Basic(optional = false)
    @Column(name = "EenEuros")
    private int eenEuros;
    @Basic(optional = false)
    @Column(name = "VijftigCenten")
    private int vijftigCenten;
    @Basic(optional = false)
    @Column(name = "TwintigCenten")
    private int twintigCenten;
    @Basic(optional = false)
    @Column(name = "TienCenten")
    private int tienCenten;
    @Basic(optional = false)
    @Column(name = "VijfCenten")
    private int vijfCenten;
    @Basic(optional = false)
    @Column(name = "TweeCenten")
    private int tweeCenten;
    @Basic(optional = false)
    @Column(name = "EenCenten")
    private int eenCenten;


    public Kas() {
    }


    public Kas(int honderdEuros, int vijftigEuro, int twintigEuros, int tienEuros, int vijfEuros, int tweeEuros, int eenEuros, int vijftigCenten, int twintigCenten, int tienCenten, int vijfCenten, int tweeCenten, int eenCenten) {
        
        this.honderdEuros = honderdEuros;
        this.vijftigEuro = vijftigEuro;
        this.twintigEuros = twintigEuros;
        this.tienEuros = tienEuros;
        this.vijfEuros = vijfEuros;
        this.tweeEuros = tweeEuros;
        this.eenEuros = eenEuros;
        this.vijftigCenten = vijftigCenten;
        this.twintigCenten = twintigCenten;
        this.tienCenten = tienCenten;
        this.vijfCenten = vijfCenten;
        this.tweeCenten = tweeCenten;
        this.eenCenten = eenCenten;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getHonderdEuros() {
        return honderdEuros;
    }

    public void setHonderdEuros(int honderdEuros) {
        this.honderdEuros = honderdEuros;
    }

    public int getVijftigEuro() {
        return vijftigEuro;
    }

    public void setVijftigEuro(int vijftigEuro) {
        this.vijftigEuro = vijftigEuro;
    }

    public int getTwintigEuros() {
        return twintigEuros;
    }

    public void setTwintigEuros(int twintigEuros) {
        this.twintigEuros = twintigEuros;
    }

    public int getTienEuros() {
        return tienEuros;
    }

    public void setTienEuros(int tienEuros) {
        this.tienEuros = tienEuros;
    }

    public int getVijfEuros() {
        return vijfEuros;
    }

    public void setVijfEuros(int vijfEuros) {
        this.vijfEuros = vijfEuros;
    }

    public int getTweeEuros() {
        return tweeEuros;
    }

    public void setTweeEuros(int tweeEuros) {
        this.tweeEuros = tweeEuros;
    }

    public int getEenEuros() {
        return eenEuros;
    }

    public void setEenEuros(int eenEuros) {
        this.eenEuros = eenEuros;
    }

    public int getVijftigCenten() {
        return vijftigCenten;
    }

    public void setVijftigCenten(int vijftigCenten) {
        this.vijftigCenten = vijftigCenten;
    }

    public int getTwintigCenten() {
        return twintigCenten;
    }

    public void setTwintigCenten(int twintigCenten) {
        this.twintigCenten = twintigCenten;
    }

    public int getTienCenten() {
        return tienCenten;
    }

    public void setTienCenten(int tienCenten) {
        this.tienCenten = tienCenten;
    }

    public int getVijfCenten() {
        return vijfCenten;
    }

    public void setVijfCenten(int vijfCenten) {
        this.vijfCenten = vijfCenten;
    }

    public int getTweeCenten() {
        return tweeCenten;
    }

    public void setTweeCenten(int tweeCenten) {
        this.tweeCenten = tweeCenten;
    }

    public int getEenCenten() {
        return eenCenten;
    }

    public void setEenCenten(int eenCenten) {
        this.eenCenten = eenCenten;
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
        if (!(object instanceof Kas)) {
            return false;
        }
        Kas other = (Kas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Kas[ id=" + id + " ]";
    }
    
    public double totalPerEenheid(int aantal, double waarde){
        return aantal * waarde;
    }
    
    public double total(){
        return (honderdEuros*100)+(vijftigEuro*50)+ (twintigEuros*20)+ (tienEuros*10)+(vijfEuros*5)+(tweeEuros*2)+(eenEuros*1)+(vijftigCenten*0.50)+(twintigCenten*0.20)+(tienCenten*0.10)+(vijfCenten*0.05)+(tweeCenten*0.02)+(eenCenten*0.01);
    }
}
