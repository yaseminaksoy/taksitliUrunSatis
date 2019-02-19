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
@Table(name = "NAKITSATIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nakitsatis.findAll", query = "SELECT n FROM Nakitsatis n")
    , @NamedQuery(name = "Nakitsatis.findById", query = "SELECT n FROM Nakitsatis n WHERE n.id = :id")
    , @NamedQuery(name = "Nakitsatis.findByMusteriid", query = "SELECT n FROM Nakitsatis n WHERE n.musteriid = :musteriid")
    , @NamedQuery(name = "Nakitsatis.findByToplamtutar", query = "SELECT n FROM Nakitsatis n WHERE n.toplamtutar = :toplamtutar")})
public class Nakitsatis implements Serializable {

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

    public Nakitsatis() {
    }

    public Nakitsatis(Integer id) {
        this.id = id;
    }

    public Nakitsatis(Integer id, int musteriid, double toplamtutar) {
        this.id = id;
        this.musteriid = musteriid;
        this.toplamtutar = toplamtutar;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nakitsatis)) {
            return false;
        }
        Nakitsatis other = (Nakitsatis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projebp2.Nakitsatis[ id=" + id + " ]";
    }
    
}
