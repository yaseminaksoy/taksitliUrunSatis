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
@Table(name = "URUN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Urun_1.findAll", query = "SELECT u FROM Urun_1 u")
    , @NamedQuery(name = "Urun_1.findById", query = "SELECT u FROM Urun_1 u WHERE u.id = :id")
    , @NamedQuery(name = "Urun_1.findByUrunadi", query = "SELECT u FROM Urun_1 u WHERE u.urunadi = :urunadi")
    , @NamedQuery(name = "Urun_1.findByFiyat", query = "SELECT u FROM Urun_1 u WHERE u.fiyat = :fiyat")
    , @NamedQuery(name = "Urun_1.findByAdet", query = "SELECT u FROM Urun_1 u WHERE u.adet = :adet")})
public class Urun_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "URUNADI")
    private String urunadi;
    @Basic(optional = false)
    @Column(name = "FIYAT")
    private int fiyat;
    @Basic(optional = false)
    @Column(name = "ADET")
    private int adet;

    public Urun_1() {
    }

    public Urun_1(Integer id) {
        this.id = id;
    }

    public Urun_1(Integer id, String urunadi, int fiyat, int adet) {
        this.id = id;
        this.urunadi = urunadi;
        this.fiyat = fiyat;
        this.adet = adet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrunadi() {
        return urunadi;
    }

    public void setUrunadi(String urunadi) {
        this.urunadi = urunadi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
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
        if (!(object instanceof Urun_1)) {
            return false;
        }
        Urun_1 other = (Urun_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projebp2.Urun_1[ id=" + id + " ]";
    }
    
}
