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
@Table(name = "rol")
@XmlRootElement

    @NamedQuery(name = "Rol.findById", query = "SELECT r FROM Rol r WHERE r.id = :id")

public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "TweeEuro")
    private int tweeEuro;
    @Basic(optional = false)
    @Column(name = "EenEuro")
    private int eenEuro;
    @Basic(optional = false)
    @Column(name = "VijftigCent")
    private int vijftigCent;
    @Basic(optional = false)
    @Column(name = "TwintigCent")
    private int twintigCent;
    @Basic(optional = false)
    @Column(name = "TienCent")
    private int tienCent;
    @Basic(optional = false)
    @Column(name = "VijfCent")
    private int vijfCent;
    @Basic(optional = false)
    @Column(name = "TweeCent")
    private int tweeCent;
    @Basic(optional = false)
    @Column(name = "EenCent")
    private int eenCent;

    public Rol() {
    }


    public Rol( int tweeEuro, int eenEuro, int vijftigCent, int twintigCent, int tienCent, int vijfCent, int tweeCent, int eenCent) {
        this.tweeEuro = tweeEuro;
        this.eenEuro = eenEuro;
        this.vijftigCent = vijftigCent;
        this.twintigCent = twintigCent;
        this.tienCent = tienCent;
        this.vijfCent = vijfCent;
        this.tweeCent = tweeCent;
        this.eenCent = eenCent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTweeEuro() {
        return tweeEuro;
    }

    public void setTweeEuro(int tweeEuro) {
        this.tweeEuro = tweeEuro;
    }

    public int getEenEuro() {
        return eenEuro;
    }

    public void setEenEuro(int eenEuro) {
        this.eenEuro = eenEuro;
    }

    public int getVijftigCent() {
        return vijftigCent;
    }

    public void setVijftigCent(int vijftigCent) {
        this.vijftigCent = vijftigCent;
    }

    public int getTwintigCent() {
        return twintigCent;
    }

    public void setTwintigCent(int twintigCent) {
        this.twintigCent = twintigCent;
    }

    public int getTienCent() {
        return tienCent;
    }

    public void setTienCent(int tienCent) {
        this.tienCent = tienCent;
    }

    public int getVijfCent() {
        return vijfCent;
    }

    public void setVijfCent(int vijfCent) {
        this.vijfCent = vijfCent;
    }

    public int getTweeCent() {
        return tweeCent;
    }

    public void setTweeCent(int tweeCent) {
        this.tweeCent = tweeCent;
    }

    public int getEenCent() {
        return eenCent;
    }

    public void setEenCent(int eenCent) {
        this.eenCent = eenCent;
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
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Rol[ id=" + id + " ]";
    }
    
    public double totalPerRol(int aantal, double waarde, int stukkenPerRol){
        return aantal * waarde * stukkenPerRol ;
    }
    public double total(){
    return (tweeEuro*2*25)+(eenEuro*1*25)+(vijftigCent*0.5*40)+(twintigCent*0.2*40)+(tienCent*0.1*40)+(vijfCent*0.05*50)+(tweeCent*0.02*50)+(eenCent*0.01*50);
    }
}