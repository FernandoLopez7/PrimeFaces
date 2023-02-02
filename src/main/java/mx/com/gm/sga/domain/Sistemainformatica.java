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
@Table(name = "sistemainformatica")
@NamedQueries({
    @NamedQuery(name = "Sistemainformatica.findAll", query = "SELECT s FROM Sistemainformatica s"),
    @NamedQuery(name = "Sistemainformatica.findByIdsistemainformatica", query = "SELECT s FROM Sistemainformatica s WHERE s.idsistemainformatica = :idsistemainformatica"),
    @NamedQuery(name = "Sistemainformatica.findByNombredelsistema", query = "SELECT s FROM Sistemainformatica s WHERE s.nombredelsistema = :nombredelsistema"),
    @NamedQuery(name = "Sistemainformatica.findByDescripcion", query = "SELECT s FROM Sistemainformatica s WHERE s.descripcion = :descripcion"),
    @NamedQuery(name = "Sistemainformatica.findByValor", query = "SELECT s FROM Sistemainformatica s WHERE s.valor = :valor")})
public class Sistemainformatica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsistemainformatica")
    private Integer idsistemainformatica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombredelsistema")
    private String nombredelsistema;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private float valor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sistemainformatica")
    private Collection<Solicitud> solicitudCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sistemainformatica1")
    private Collection<Solicitud> solicitudCollection1;

    public Sistemainformatica() {
    }

    public Sistemainformatica(Integer idsistemainformatica) {
        this.idsistemainformatica = idsistemainformatica;
    }

    public Sistemainformatica(Integer idsistemainformatica, String nombredelsistema, float valor) {
        this.idsistemainformatica = idsistemainformatica;
        this.nombredelsistema = nombredelsistema;
        this.valor = valor;
    }

    public Integer getIdsistemainformatica() {
        return idsistemainformatica;
    }

    public void setIdsistemainformatica(Integer idsistemainformatica) {
        this.idsistemainformatica = idsistemainformatica;
    }

    public String getNombredelsistema() {
        return nombredelsistema;
    }

    public void setNombredelsistema(String nombredelsistema) {
        this.nombredelsistema = nombredelsistema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Collection<Solicitud> getSolicitudCollection() {
        return solicitudCollection;
    }

    public void setSolicitudCollection(Collection<Solicitud> solicitudCollection) {
        this.solicitudCollection = solicitudCollection;
    }

    public Collection<Solicitud> getSolicitudCollection1() {
        return solicitudCollection1;
    }

    public void setSolicitudCollection1(Collection<Solicitud> solicitudCollection1) {
        this.solicitudCollection1 = solicitudCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsistemainformatica != null ? idsistemainformatica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sistemainformatica)) {
            return false;
        }
        Sistemainformatica other = (Sistemainformatica) object;
        if ((this.idsistemainformatica == null && other.idsistemainformatica != null) || (this.idsistemainformatica != null && !this.idsistemainformatica.equals(other.idsistemainformatica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.Sistemainformatica[ idsistemainformatica=" + idsistemainformatica + " ]";
    }
    
}
