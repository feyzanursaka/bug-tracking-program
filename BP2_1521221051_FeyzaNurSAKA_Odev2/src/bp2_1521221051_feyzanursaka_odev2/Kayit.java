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
@Table(name = "KAYIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kayit.findAll", query = "SELECT k FROM Kayit k"),
    @NamedQuery(name = "Kayit.findByKayitid", query = "SELECT k FROM Kayit k WHERE k.kayitid = :kayitid"),
    @NamedQuery(name = "Kayit.findByMusteriid", query = "SELECT k FROM Kayit k WHERE k.musteriid = :musteriid"),
    @NamedQuery(name = "Kayit.findByCihazturu", query = "SELECT k FROM Kayit k WHERE k.cihazturu = :cihazturu"),
    @NamedQuery(name = "Kayit.findByCihazdurumu", query = "SELECT k FROM Kayit k WHERE k.cihazdurumu = :cihazdurumu"),
    @NamedQuery(name = "Kayit.findByTeslimtariihi", query = "SELECT k FROM Kayit k WHERE k.teslimtariihi = :teslimtariihi"),
    @NamedQuery(name = "Kayit.findByUcret", query = "SELECT k FROM Kayit k WHERE k.ucret = :ucret")})
public class Kayit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KAYITID")
    private Integer kayitid;
    @Column(name = "MUSTERIID")
    private Integer musteriid;
    @Column(name = "CIHAZTURU")
    private String cihazturu;
    @Column(name = "CIHAZDURUMU")
    private String cihazdurumu;
    @Column(name = "TESLIMTARIIHI")
    private String teslimtariihi;
    @Column(name = "UCRET")
    private Integer ucret;

    public Kayit() {
    }

    public Kayit(Integer kayitid) {
        this.kayitid = kayitid;
    }

    public Integer getKayitid() {
        return kayitid;
    }

    public void setKayitid(Integer kayitid) {
        this.kayitid = kayitid;
    }

    public Integer getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(Integer musteriid) {
        this.musteriid = musteriid;
    }

    public String getCihazturu() {
        return cihazturu;
    }

    public void setCihazturu(String cihazturu) {
        this.cihazturu = cihazturu;
    }

    public String getCihazdurumu() {
        return cihazdurumu;
    }

    public void setCihazdurumu(String cihazdurumu) {
        this.cihazdurumu = cihazdurumu;
    }

    public String getTeslimtariihi() {
        return teslimtariihi;
    }

    public void setTeslimtariihi(String teslimtariihi) {
        this.teslimtariihi = teslimtariihi;
    }

    public Integer getUcret() {
        return ucret;
    }

    public void setUcret(Integer ucret) {
        this.ucret = ucret;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kayitid != null ? kayitid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kayit)) {
            return false;
        }
        Kayit other = (Kayit) object;
        if ((this.kayitid == null && other.kayitid != null) || (this.kayitid != null && !this.kayitid.equals(other.kayitid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2_1521221051_feyzanursaka_odev2.Kayit[ kayitid=" + kayitid + " ]";
    }
    
}
