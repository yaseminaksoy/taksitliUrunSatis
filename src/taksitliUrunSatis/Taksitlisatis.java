/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taksitliUrunSatis;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sony
 */
@Entity
@Table(name = "TAKSITLISATIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Taksitlisatis.findAll", query = "SELECT t FROM Taksitlisatis t")
    , @NamedQuery(name = "Taksitlisatis.findById", query = "SELECT t FROM Taksitlisatis t WHERE t.id = :id")
    , @NamedQuery(name = "Taksitlisatis.findByMusteriid", query = "SELECT t FROM Taksitlisatis t WHERE t.musteriid = :musteriid")
    , @NamedQuery(name = "Taksitlisatis.findByToplamtutar", query = "SELECT t FROM Taksitlisatis t WHERE t.toplamtutar = :toplamtutar")
    , @NamedQuery(name = "Taksitlisatis.findByTaksitsayisi", query = "SELECT t FROM Taksitlisatis t WHERE t.taksitsayisi = :taksitsayisi")
    , @NamedQuery(name = "Taksitlisatis.findByOdenentaksitsayisi", query = "SELECT t FROM Taksitlisatis t WHERE t.odenentaksitsayisi = :odenentaksitsayisi")})
public class Taksitlisatis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "MUSTERIID")
    private int musteriid;
    @Basic(optional = false)
    @Column(name = "TOPLAMTUTAR")
    private double toplamtutar;
    @Basic(optional = false)
    @Column(name = "TAKSITSAYISI")
    private int taksitsayisi;
    @Column(name = "ODENENTAKSITSAYISI")
    private Integer odenentaksitsayisi;

    public Taksitlisatis() {
    }

    public Taksitlisatis(Integer id) {
        this.id = id;
    }

    public Taksitlisatis(Integer id, int musteriid, double toplamtutar, int taksitsayisi) {
        this.id = id;
        this.musteriid = musteriid;
        this.toplamtutar = toplamtutar;
        this.taksitsayisi = taksitsayisi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(int musteriid) {
        this.musteriid = musteriid;
    }

    public double getToplamtutar() {
        return toplamtutar;
    }

    public void setToplamtutar(double toplamtutar) {
        this.toplamtutar = toplamtutar;
    }

    public int getTaksitsayisi() {
        return taksitsayisi;
    }

    public void setTaksitsayisi(int taksitsayisi) {
        this.taksitsayisi = taksitsayisi;
    }

    public Integer getOdenentaksitsayisi() {
        return odenentaksitsayisi;
    }

    public void setOdenentaksitsayisi(Integer odenentaksitsayisi) {
        this.odenentaksitsayisi = odenentaksitsayisi;
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
        if (!(object instanceof Taksitlisatis)) {
            return false;
        }
        Taksitlisatis other = (Taksitlisatis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projebp2.Taksitlisatis[ id=" + id + " ]";
    }
    
}
