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
@Table(name = "MUSTERI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musteri_1.findAll", query = "SELECT m FROM Musteri_1 m")
    , @NamedQuery(name = "Musteri_1.findById", query = "SELECT m FROM Musteri_1 m WHERE m.id = :id")
    , @NamedQuery(name = "Musteri_1.findByKullaniciadi", query = "SELECT m FROM Musteri_1 m WHERE m.kullaniciadi = :kullaniciadi")
    , @NamedQuery(name = "Musteri_1.findByAdi", query = "SELECT m FROM Musteri_1 m WHERE m.adi = :adi")
    , @NamedQuery(name = "Musteri_1.findBySoyadi", query = "SELECT m FROM Musteri_1 m WHERE m.soyadi = :soyadi")
    , @NamedQuery(name = "Musteri_1.findBySifre", query = "SELECT m FROM Musteri_1 m WHERE m.sifre = :sifre")})
public class Musteri_1 implements Serializable {

    @Column(name = "ODEMELER")
    private Integer odemeler;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "KULLANICIADI")
    private String kullaniciadi;
    @Basic(optional = false)
    @Column(name = "ADI")
    private String adi;
    @Basic(optional = false)
    @Column(name = "SOYADI")
    private String soyadi;
    @Basic(optional = false)
    @Column(name = "SIFRE")
    private String sifre;

    public Musteri_1() {
    }

    public Musteri_1(Integer id) {
        this.id = id;
    }

    public Musteri_1(Integer id, String kullaniciadi, String adi, String soyadi, String sifre) {
        this.id = id;
        this.kullaniciadi = kullaniciadi;
        this.adi = adi;
        this.soyadi = soyadi;
        this.sifre = sifre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
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
        if (!(object instanceof Musteri_1)) {
            return false;
        }
        Musteri_1 other = (Musteri_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projebp2.Musteri_1[ id=" + id + " ]";
    }

    public Integer getOdemeler() {
        return odemeler;
    }

    public void setOdemeler(Integer odemeler) {
        this.odemeler = odemeler;
    }
    
}
