/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author gabol
 */
@Entity
@Table(name = "enum_tiporequerimientos")
@NamedQueries({
    @NamedQuery(name = "EnumTiporequerimientos.findAll", query = "SELECT e FROM EnumTiporequerimientos e"),
    @NamedQuery(name = "EnumTiporequerimientos.findByIdenumTipoRequerimientos", query = "SELECT e FROM EnumTiporequerimientos e WHERE e.idenumTipoRequerimientos = :idenumTipoRequerimientos"),
    @NamedQuery(name = "EnumTiporequerimientos.findByRequerimiento", query = "SELECT e FROM EnumTiporequerimientos e WHERE e.requerimiento = :requerimiento")})
public class EnumTiporequerimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idenum_TipoRequerimientos")
    private Integer idenumTipoRequerimientos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "requerimiento")
    private String requerimiento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enumTiporequerimientos")
    private Collection<Solicitud> solicitudCollection;

    public EnumTiporequerimientos() {
    }

    public EnumTiporequerimientos(Integer idenumTipoRequerimientos) {
        this.idenumTipoRequerimientos = idenumTipoRequerimientos;
    }

    public EnumTiporequerimientos(Integer idenumTipoRequerimientos, String requerimiento) {
        this.idenumTipoRequerimientos = idenumTipoRequerimientos;
        this.requerimiento = requerimiento;
    }

    public Integer getIdenumTipoRequerimientos() {
        return idenumTipoRequerimientos;
    }

    public void setIdenumTipoRequerimientos(Integer idenumTipoRequerimientos) {
        this.idenumTipoRequerimientos = idenumTipoRequerimientos;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    public Collection<Solicitud> getSolicitudCollection() {
        return solicitudCollection;
    }

    public void setSolicitudCollection(Collection<Solicitud> solicitudCollection) {
        this.solicitudCollection = solicitudCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idenumTipoRequerimientos != null ? idenumTipoRequerimientos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnumTiporequerimientos)) {
            return false;
        }
        EnumTiporequerimientos other = (EnumTiporequerimientos) object;
        if ((this.idenumTipoRequerimientos == null && other.idenumTipoRequerimientos != null) || (this.idenumTipoRequerimientos != null && !this.idenumTipoRequerimientos.equals(other.idenumTipoRequerimientos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.EnumTiporequerimientos[ idenumTipoRequerimientos=" + idenumTipoRequerimientos + " ]";
    }
    
}
