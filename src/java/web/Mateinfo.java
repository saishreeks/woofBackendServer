/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author saishree
 */
@Entity
@Table(name = "Mate_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mateinfo.findAll", query = "SELECT m FROM Mateinfo m")
    , @NamedQuery(name = "Mateinfo.findByMateInfoId", query = "SELECT m FROM Mateinfo m WHERE m.mateInfoId = :mateInfoId")
    , @NamedQuery(name = "Mateinfo.findByMateDate", query = "SELECT m FROM Mateinfo m WHERE m.mateDate = :mateDate")})
public class Mateinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mate_info_id")
    private Integer mateInfoId;
    @Column(name = "mate_date")
    @Temporal(TemporalType.DATE)
    private Date mateDate;
    @OneToMany(mappedBy = "reqId")
    private Collection<Matereq> matereqCollection;
    @JoinColumn(name = "dog_id", referencedColumnName = "dog_id")
    @ManyToOne
    private DogDetails dogId;
    @JoinColumn(name = "dog_id_2", referencedColumnName = "dog_id")
    @ManyToOne
    private DogDetails dogId2;

    public Mateinfo() {
    }

    public Mateinfo(Integer mateInfoId) {
        this.mateInfoId = mateInfoId;
    }

    public Integer getMateInfoId() {
        return mateInfoId;
    }

    public void setMateInfoId(Integer mateInfoId) {
        this.mateInfoId = mateInfoId;
    }

    public Date getMateDate() {
        return mateDate;
    }

    public void setMateDate(Date mateDate) {
        this.mateDate = mateDate;
    }

    @XmlTransient
    public Collection<Matereq> getMatereqCollection() {
        return matereqCollection;
    }

    public void setMatereqCollection(Collection<Matereq> matereqCollection) {
        this.matereqCollection = matereqCollection;
    }

    public DogDetails getDogId() {
        return dogId;
    }

    public void setDogId(DogDetails dogId) {
        this.dogId = dogId;
    }

    public DogDetails getDogId2() {
        return dogId2;
    }

    public void setDogId2(DogDetails dogId2) {
        this.dogId2 = dogId2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mateInfoId != null ? mateInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mateinfo)) {
            return false;
        }
        Mateinfo other = (Mateinfo) object;
        if ((this.mateInfoId == null && other.mateInfoId != null) || (this.mateInfoId != null && !this.mateInfoId.equals(other.mateInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Mateinfo[ mateInfoId=" + mateInfoId + " ]";
    }
    
}
