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
@Table(name = "SATIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Satis.findAll", query = "SELECT s FROM Satis s")
    , @NamedQuery(name = "Satis.findById", query = "SELECT s FROM Satis s WHERE s.id = :id")
    , @NamedQuery(name = "Satis.findByUrunid", query = "SELECT s FROM Satis s WHERE s.urunid = :urunid")
    , @NamedQuery(name = "Satis.findByMusteriid", query = "SELECT s FROM Satis s WHERE s.musteriid = :musteriid")
    , @NamedQuery(name = "Satis.findByUrunadi", query = "SELECT s FROM Satis s WHERE s.urunadi = :urunadi")
    , @NamedQuery(name = "Satis.findByTutar", query = "SELECT s FROM Satis s WHERE s.tutar = :tutar")
    , @NamedQuery(name = "Satis.findByAdet", query = "SELECT s FROM Satis s WHERE s.adet = :adet")})
public class Satis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "URUNID")
    private int urunid;
    @Basic(optional = false)
    @Column(name = "MUSTERIID")
    private int musteriid;
    @Basic(optional = false)
    @Column(name = "URUNADI")
    private String urunadi;
    @Basic(optional = false)
    @Column(name = "TUTAR")
    private int tutar;
    @Basic(optional = false)
    @Column(name = "ADET")
    private int adet;

    public Satis() {
    }

    public Satis(Integer id) {
        this.id = id;
    }

    public Satis(Integer id, int urunid, int musteriid, String urunadi, int tutar, int adet) {
        this.id = id;
        this.urunid = urunid;
        this.musteriid = musteriid;
        this.urunadi = urunadi;
        this.tutar = tutar;
        this.adet = adet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUrunid() {
        return urunid;
    }

    public void setUrunid(int urunid) {
        this.urunid = urunid;
    }

    public int getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(int musteriid) {
        this.musteriid = musteriid;
    }

    public String getUrunadi() {
        return urunadi;
    }

    public void setUrunadi(String urunadi) {
        this.urunadi = urunadi;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
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
        if (!(object instanceof Satis)) {
            return false;
        }
        Satis other = (Satis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projebp2.Satis[ id=" + id + " ]";
    }
    
}
