/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.domain;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author gabol
 */
@Entity
@Table(name = "respuestasolicitud")
@NamedQueries({
    @NamedQuery(name = "Respuestasolicitud.findAll", query = "SELECT r FROM Respuestasolicitud r"),
    @NamedQuery(name = "Respuestasolicitud.findByIdrespuestasolicitud", query = "SELECT r FROM Respuestasolicitud r WHERE r.idrespuestasolicitud = :idrespuestasolicitud"),
    @NamedQuery(name = "Respuestasolicitud.findByNombreaprobante", query = "SELECT r FROM Respuestasolicitud r WHERE r.nombreaprobante = :nombreaprobante"),
    @NamedQuery(name = "Respuestasolicitud.findByCargoaprobante", query = "SELECT r FROM Respuestasolicitud r WHERE r.cargoaprobante = :cargoaprobante"),
    @NamedQuery(name = "Respuestasolicitud.findByDescripcion", query = "SELECT r FROM Respuestasolicitud r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "Respuestasolicitud.findByRespuesta", query = "SELECT r FROM Respuestasolicitud r WHERE r.respuesta = :respuesta"),
    @NamedQuery(name = "Respuestasolicitud.findByFecha", query = "SELECT r FROM Respuestasolicitud r WHERE r.fecha = :fecha")})
public class Respuestasolicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrespuestasolicitud")
    private Integer idrespuestasolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreaprobante")
    private String nombreaprobante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cargoaprobante")
    private String cargoaprobante;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "respuesta")
    private short respuesta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "empresaexterna", referencedColumnName = "idempresaexterna", insertable = false, updatable = false)    
    @ManyToOne(optional = false)
    private Empresaexterna empresaexterna;
    @JoinColumn(name = "solicitud", referencedColumnName = "idsolicitud", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Solicitud solicitud;
    @JoinColumn(name = "tecnico", referencedColumnName = "idtecnico", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tecnico tecnico;

    @Basic(optional = false)
    @Column(name = "empresaexterna")
    private Integer idempresaexterna;

    @Basic(optional = false)
    @Column(name = "solicitud")
    private Integer idsolicitud;

    @Basic(optional = false)
    @Column(name = "tecnico")
    private Integer idtecnico;

    public Integer getIdempresaexterna() {
        return idempresaexterna;
    }

    public void setIdempresaexterna(Integer idempresaexterna) {
        this.idempresaexterna = idempresaexterna;
    }

    public Integer getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(Integer idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public Integer getIdtecnico() {
        return idtecnico;
    }

    public void setIdtecnico(Integer idtecnico) {
        this.idtecnico = idtecnico;
    }

    public Respuestasolicitud() {
    }

    public Respuestasolicitud(Integer idrespuestasolicitud) {
        this.idrespuestasolicitud = idrespuestasolicitud;
    }

    public Respuestasolicitud(Integer idrespuestasolicitud, String nombreaprobante, String cargoaprobante, short respuesta, Date fecha) {
        this.idrespuestasolicitud = idrespuestasolicitud;
        this.nombreaprobante = nombreaprobante;
        this.cargoaprobante = cargoaprobante;
        this.respuesta = respuesta;
        this.fecha = fecha;
    }

    public Integer getIdrespuestasolicitud() {
        return idrespuestasolicitud;
    }

    public void setIdrespuestasolicitud(Integer idrespuestasolicitud) {
        this.idrespuestasolicitud = idrespuestasolicitud;
    }

    public String getNombreaprobante() {
        return nombreaprobante;
    }

    public void setNombreaprobante(String nombreaprobante) {
        this.nombreaprobante = nombreaprobante;
    }

    public String getCargoaprobante() {
        return cargoaprobante;
    }

    public void setCargoaprobante(String cargoaprobante) {
        this.cargoaprobante = cargoaprobante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(short respuesta) {
        this.respuesta = respuesta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empresaexterna getEmpresaexterna() {
        return empresaexterna;
    }

    public void setEmpresaexterna(Empresaexterna empresaexterna) {
        this.empresaexterna = empresaexterna;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrespuestasolicitud != null ? idrespuestasolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Respuestasolicitud)) {
            return false;
        }
        Respuestasolicitud other = (Respuestasolicitud) object;
        if ((this.idrespuestasolicitud == null && other.idrespuestasolicitud != null) || (this.idrespuestasolicitud != null && !this.idrespuestasolicitud.equals(other.idrespuestasolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.Respuestasolicitud[ idrespuestasolicitud=" + idrespuestasolicitud + " ]";
    }

}
