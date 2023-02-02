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
@Table(name = "empresaexterna")
@NamedQueries({
    @NamedQuery(name = "Empresaexterna.findAll", query = "SELECT e FROM Empresaexterna e"),
    @NamedQuery(name = "Empresaexterna.findByIdempresaexterna", query = "SELECT e FROM Empresaexterna e WHERE e.idempresaexterna = :idempresaexterna"),
    @NamedQuery(name = "Empresaexterna.findByNombre", query = "SELECT e FROM Empresaexterna e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empresaexterna.findByRepresentante", query = "SELECT e FROM Empresaexterna e WHERE e.representante = :representante"),
    @NamedQuery(name = "Empresaexterna.findByValor", query = "SELECT e FROM Empresaexterna e WHERE e.valor = :valor")})
public class Empresaexterna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempresaexterna")
    private Integer idempresaexterna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "representante")
    private String representante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private float valor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresaexterna")
    private Collection<Respuestasolicitud> respuestasolicitudCollection;

    public Empresaexterna() {
    }

    public Empresaexterna(Integer idempresaexterna) {
        this.idempresaexterna = idempresaexterna;
    }

    public Empresaexterna(Integer idempresaexterna, String nombre, String representante, float valor) {
        this.idempresaexterna = idempresaexterna;
        this.nombre = nombre;
        this.representante = representante;
        this.valor = valor;
    }

    public Integer getIdempresaexterna() {
        return idempresaexterna;
    }

    public void setIdempresaexterna(Integer idempresaexterna) {
        this.idempresaexterna = idempresaexterna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Collection<Respuestasolicitud> getRespuestasolicitudCollection() {
        return respuestasolicitudCollection;
    }

    public void setRespuestasolicitudCollection(Collection<Respuestasolicitud> respuestasolicitudCollection) {
        this.respuestasolicitudCollection = respuestasolicitudCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempresaexterna != null ? idempresaexterna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresaexterna)) {
            return false;
        }
        Empresaexterna other = (Empresaexterna) object;
        if ((this.idempresaexterna == null && other.idempresaexterna != null) || (this.idempresaexterna != null && !this.idempresaexterna.equals(other.idempresaexterna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.Empresaexterna[ idempresaexterna=" + idempresaexterna + " ]";
    }
    
}
