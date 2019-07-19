/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_1521221051_feyzanursaka_odev2;

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
 * @author Feyza Nur Saka
 */
@Entity
@Table(name = "MUSTERI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musteri.findAll", query = "SELECT m FROM Musteri m"),
    @NamedQuery(name = "Musteri.findByMusteriid", query = "SELECT m FROM Musteri m WHERE m.musteriid = :musteriid"),
    @NamedQuery(name = "Musteri.findByMusteriadi", query = "SELECT m FROM Musteri m WHERE m.musteriadi = :musteriadi"),
    @NamedQuery(name = "Musteri.findByMusterisoyadi", query = "SELECT m FROM Musteri m WHERE m.musterisoyadi = :musterisoyadi"),
    @NamedQuery(name = "Musteri.findByYoneticiid", query = "SELECT m FROM Musteri m WHERE m.yoneticiid = :yoneticiid"),
    @NamedQuery(name = "Musteri.findByMusterisifre", query = "SELECT m FROM Musteri m WHERE m.musterisifre = :musterisifre")})
public class Musteri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MUSTERIID")
    private Integer musteriid;
    @Column(name = "MUSTERIADI")
    private String musteriadi;
    @Column(name = "MUSTERISOYADI")
    private String musterisoyadi;
    @Column(name = "YONETICIID")
    private Integer yoneticiid;
    @Column(name = "MUSTERISIFRE")
    private String musterisifre;

    public Musteri() {
    }

    public Musteri(Integer musteriid) {
        this.musteriid = musteriid;
    }

    public Integer getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(Integer musteriid) {
        this.musteriid = musteriid;
    }

    public String getMusteriadi() {
        return musteriadi;
    }

    public void setMusteriadi(String musteriadi) {
        this.musteriadi = musteriadi;
    }

    public String getMusterisoyadi() {
        return musterisoyadi;
    }

    public void setMusterisoyadi(String musterisoyadi) {
        this.musterisoyadi = musterisoyadi;
    }

    public Integer getYoneticiid() {
        return yoneticiid;
    }

    public void setYoneticiid(Integer yoneticiid) {
        this.yoneticiid = yoneticiid;
    }

    public String getMusterisifre() {
        return musterisifre;
    }

    public void setMusterisifre(String musterisifre) {
        this.musterisifre = musterisifre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (musteriid != null ? musteriid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musteri)) {
            return false;
        }
        Musteri other = (Musteri) object;
        if ((this.musteriid == null && other.musteriid != null) || (this.musteriid != null && !this.musteriid.equals(other.musteriid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2_1521221051_feyzanursaka_odev2.Musteri[ musteriid=" + musteriid + " ]";
    }
    
}
