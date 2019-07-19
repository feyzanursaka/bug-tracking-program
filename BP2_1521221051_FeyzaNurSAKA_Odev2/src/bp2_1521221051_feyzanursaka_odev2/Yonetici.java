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
@Table(name = "YONETICI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Yonetici.findAll", query = "SELECT y FROM Yonetici y"),
    @NamedQuery(name = "Yonetici.findByYoneticiid", query = "SELECT y FROM Yonetici y WHERE y.yoneticiid = :yoneticiid"),
    @NamedQuery(name = "Yonetici.findByYoneticiadi", query = "SELECT y FROM Yonetici y WHERE y.yoneticiadi = :yoneticiadi"),
    @NamedQuery(name = "Yonetici.findByYoneticisoyadi", query = "SELECT y FROM Yonetici y WHERE y.yoneticisoyadi = :yoneticisoyadi"),
    @NamedQuery(name = "Yonetici.findByYoneticikullaniciadi", query = "SELECT y FROM Yonetici y WHERE y.yoneticikullaniciadi = :yoneticikullaniciadi"),
    @NamedQuery(name = "Yonetici.findByYoneticisifre", query = "SELECT y FROM Yonetici y WHERE y.yoneticisifre = :yoneticisifre")})
public class Yonetici implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "YONETICIID")
    private Integer yoneticiid;
    @Column(name = "YONETICIADI")
    private String yoneticiadi;
    @Column(name = "YONETICISOYADI")
    private String yoneticisoyadi;
    @Column(name = "YONETICIKULLANICIADI")
    private String yoneticikullaniciadi;
    @Column(name = "YONETICISIFRE")
    private String yoneticisifre;

    public Yonetici() {
    }

    public Yonetici(Integer yoneticiid) {
        this.yoneticiid = yoneticiid;
    }

    public Integer getYoneticiid() {
        return yoneticiid;
    }

    public void setYoneticiid(Integer yoneticiid) {
        this.yoneticiid = yoneticiid;
    }

    public String getYoneticiadi() {
        return yoneticiadi;
    }

    public void setYoneticiadi(String yoneticiadi) {
        this.yoneticiadi = yoneticiadi;
    }

    public String getYoneticisoyadi() {
        return yoneticisoyadi;
    }

    public void setYoneticisoyadi(String yoneticisoyadi) {
        this.yoneticisoyadi = yoneticisoyadi;
    }

    public String getYoneticikullaniciadi() {
        return yoneticikullaniciadi;
    }

    public void setYoneticikullaniciadi(String yoneticikullaniciadi) {
        this.yoneticikullaniciadi = yoneticikullaniciadi;
    }

    public String getYoneticisifre() {
        return yoneticisifre;
    }

    public void setYoneticisifre(String yoneticisifre) {
        this.yoneticisifre = yoneticisifre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (yoneticiid != null ? yoneticiid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Yonetici)) {
            return false;
        }
        Yonetici other = (Yonetici) object;
        if ((this.yoneticiid == null && other.yoneticiid != null) || (this.yoneticiid != null && !this.yoneticiid.equals(other.yoneticiid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2_1521221051_feyzanursaka_odev2.Yonetici[ yoneticiid=" + yoneticiid + " ]";
    }
    
}
