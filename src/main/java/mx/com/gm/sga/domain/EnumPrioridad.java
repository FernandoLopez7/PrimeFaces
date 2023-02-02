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
@Table(name = "enum_prioridad")
@NamedQueries({
    @NamedQuery(name = "EnumPrioridad.findAll", query = "SELECT e FROM EnumPrioridad e"),
    @NamedQuery(name = "EnumPrioridad.findByIdenumPrioridad", query = "SELECT e FROM EnumPrioridad e WHERE e.idenumPrioridad = :idenumPrioridad"),
    @NamedQuery(name = "EnumPrioridad.findByNivel", query = "SELECT e FROM EnumPrioridad e WHERE e.nivel = :nivel")})
public class EnumPrioridad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idenum_prioridad")
    private Integer idenumPrioridad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nivel")
    private String nivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enumPrioridad")
    private Collection<Solicitud> solicitudCollection;

    public EnumPrioridad() {
    }

    public EnumPrioridad(Integer idenumPrioridad) {
        this.idenumPrioridad = idenumPrioridad;
    }

    public EnumPrioridad(Integer idenumPrioridad, String nivel) {
        this.idenumPrioridad = idenumPrioridad;
        this.nivel = nivel;
    }

    public Integer getIdenumPrioridad() {
        return idenumPrioridad;
    }

    public void setIdenumPrioridad(Integer idenumPrioridad) {
        this.idenumPrioridad = idenumPrioridad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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
        hash += (idenumPrioridad != null ? idenumPrioridad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnumPrioridad)) {
            return false;
        }
        EnumPrioridad other = (EnumPrioridad) object;
        if ((this.idenumPrioridad == null && other.idenumPrioridad != null) || (this.idenumPrioridad != null && !this.idenumPrioridad.equals(other.idenumPrioridad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.EnumPrioridad[ idenumPrioridad=" + idenumPrioridad + " ]";
    }
    
}
