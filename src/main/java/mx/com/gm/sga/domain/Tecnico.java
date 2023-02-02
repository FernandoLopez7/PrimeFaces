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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tecnico")
@NamedQueries({
    @NamedQuery(name = "Tecnico.findAll", query = "SELECT t FROM Tecnico t"),
    @NamedQuery(name = "Tecnico.findByIdtecnico", query = "SELECT t FROM Tecnico t WHERE t.idtecnico = :idtecnico"),
    @NamedQuery(name = "Tecnico.findByCodigotecnico", query = "SELECT t FROM Tecnico t WHERE t.codigotecnico = :codigotecnico"),
    @NamedQuery(name = "Tecnico.findByTitulo", query = "SELECT t FROM Tecnico t WHERE t.titulo = :titulo")})
public class Tecnico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtecnico")
    private Integer idtecnico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codigotecnico")
    private String codigotecnico;
    @Size(max = 45)
    @Column(name = "titulo")
    private String titulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tecnico")
    private Collection<Respuestasolicitud> respuestasolicitudCollection;
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    
    private Persona persona;

    @Basic(optional = false)
    @Column(name = "idpersona")
    private Integer idpersona;

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }
    
    
    public Tecnico() {
    }

    public Tecnico(Integer idtecnico) {
        this.idtecnico = idtecnico;
    }

    public Tecnico(Integer idtecnico, String codigotecnico) {
        this.idtecnico = idtecnico;
        this.codigotecnico = codigotecnico;
    }
    
    
    public Integer getIdtecnico() {
        return idtecnico;
    }

    public void setIdtecnico(Integer idtecnico) {
        this.idtecnico = idtecnico;
    }

    public String getCodigotecnico() {
        return codigotecnico;
    }

    public void setCodigotecnico(String codigotecnico) {
        this.codigotecnico = codigotecnico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Collection<Respuestasolicitud> getRespuestasolicitudCollection() {
        return respuestasolicitudCollection;
    }

    public void setRespuestasolicitudCollection(Collection<Respuestasolicitud> respuestasolicitudCollection) {
        this.respuestasolicitudCollection = respuestasolicitudCollection;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtecnico != null ? idtecnico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tecnico)) {
            return false;
        }
        Tecnico other = (Tecnico) object;
        if ((this.idtecnico == null && other.idtecnico != null) || (this.idtecnico != null && !this.idtecnico.equals(other.idtecnico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.Tecnico[ idtecnico=" + idtecnico + " ]";
    }
    
}
