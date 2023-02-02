/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author gabol
 */
@Entity
@Table(name = "solicitud")
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s"),
    @NamedQuery(name = "Solicitud.findByIdsolicitud", query = "SELECT s FROM Solicitud s WHERE s.idsolicitud = :idsolicitud"),
    @NamedQuery(name = "Solicitud.findByRfc", query = "SELECT s FROM Solicitud s WHERE s.rfc = :rfc"),
    @NamedQuery(name = "Solicitud.findByImpactoencasodenoatenderalcambio", query = "SELECT s FROM Solicitud s WHERE s.impactoencasodenoatenderalcambio = :impactoencasodenoatenderalcambio"),
    @NamedQuery(name = "Solicitud.findByBeneficiosesperados", query = "SELECT s FROM Solicitud s WHERE s.beneficiosesperados = :beneficiosesperados"),
    @NamedQuery(name = "Solicitud.findByRazoncambio", query = "SELECT s FROM Solicitud s WHERE s.razoncambio = :razoncambio"),
    @NamedQuery(name = "Solicitud.findByExisteafectaciondeladb", query = "SELECT s FROM Solicitud s WHERE s.existeafectaciondeladb = :existeafectaciondeladb"),
    @NamedQuery(name = "Solicitud.findByAfectalainformaciondeladb", query = "SELECT s FROM Solicitud s WHERE s.afectalainformaciondeladb = :afectalainformaciondeladb"),
    @NamedQuery(name = "Solicitud.findByRequiereafectarlaestructuradb", query = "SELECT s FROM Solicitud s WHERE s.requiereafectarlaestructuradb = :requiereafectarlaestructuradb"),
    @NamedQuery(name = "Solicitud.findByRequiereserparteciclodesarrollo", query = "SELECT s FROM Solicitud s WHERE s.requiereserparteciclodesarrollo = :requiereserparteciclodesarrollo"),
    @NamedQuery(name = "Solicitud.findByRequiereperfilproyecto", query = "SELECT s FROM Solicitud s WHERE s.requiereperfilproyecto = :requiereperfilproyecto"),
    @NamedQuery(name = "Solicitud.findByFecha", query = "SELECT s FROM Solicitud s WHERE s.fecha = :fecha")})
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsolicitud")
    private Integer idsolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "RFC")
    private String rfc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "impactoencasodenoatenderalcambio")
    private String impactoencasodenoatenderalcambio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "beneficiosesperados")
    private String beneficiosesperados;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "razoncambio")
    private String razoncambio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "existeafectaciondeladb")
    private short existeafectaciondeladb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "afectalainformaciondeladb")
    private short afectalainformaciondeladb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "requiereafectarlaestructuradb")
    private short requiereafectarlaestructuradb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "requiereserparteciclodesarrollo")
    private short requiereserparteciclodesarrollo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "requiereperfilproyecto")
    private short requiereperfilproyecto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitud")
    private Collection<Respuestasolicitud> respuestasolicitudCollection;
    @JoinColumn(name = "prioridad", referencedColumnName = "idenum_prioridad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EnumPrioridad enumPrioridad;
    @JoinColumn(name = "tiporequerimiento", referencedColumnName = "idenum_TipoRequerimientos", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EnumTiporequerimientos enumTiporequerimientos;
    @JoinColumn(name = "sistemaantiguo", referencedColumnName = "idsistemainformatica", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sistemainformatica sistemainformatica;
    @JoinColumn(name = "sistemanuevo", referencedColumnName = "idsistemainformatica", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sistemainformatica sistemainformatica1;
    @JoinColumn(name = "solicitante", referencedColumnName = "idusuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;
    
    @Basic(optional = false)
    @Column(name = "prioridad")
    private Integer idenumprioridad;
    
    @Basic(optional = false)
    @Column(name = "tiporequerimiento")
    private Integer idenumTipoRequerimientos;
    
    @Basic(optional = false)
    @Column(name = "sistemaantiguo")
    private Integer sistemaantiguo;
    
    @Basic(optional = false)
    @Column(name = "sistemanuevo")
    private Integer sistemanuevo;
    
    @Basic(optional = false)
    @Column(name = "solicitante")
    private Integer idusuario;
    
    public Integer getIdenumprioridad() {
        return idenumprioridad;
    }

    public void setIdenumprioridad(Integer idenumprioridad) {
        this.idenumprioridad = idenumprioridad;
    }

    public Integer getIdenumTipoRequerimientos() {
        return idenumTipoRequerimientos;
    }

    public void setIdenumTipoRequerimientos(Integer idenumTipoRequerimientos) {
        this.idenumTipoRequerimientos = idenumTipoRequerimientos;
    }

    public Integer getSistemaantiguo() {
        return sistemaantiguo;
    }

    public void setSistemaantiguo(Integer sistemaantiguo) {
        this.sistemaantiguo = sistemaantiguo;
    }

    public Integer getSistemanuevo() {
        return sistemanuevo;
    }

    public void setSistemanuevo(Integer sistemanuevo) {
        this.sistemanuevo = sistemanuevo;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    
    public Solicitud() {
    }

    public Solicitud(Integer idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public Solicitud(Integer idsolicitud, String rfc, String impactoencasodenoatenderalcambio, String beneficiosesperados, String razoncambio, short existeafectaciondeladb, short afectalainformaciondeladb, short requiereafectarlaestructuradb, short requiereserparteciclodesarrollo, short requiereperfilproyecto, Date fecha) {
        this.idsolicitud = idsolicitud;
        this.rfc = rfc;
        this.impactoencasodenoatenderalcambio = impactoencasodenoatenderalcambio;
        this.beneficiosesperados = beneficiosesperados;
        this.razoncambio = razoncambio;
        this.existeafectaciondeladb = existeafectaciondeladb;
        this.afectalainformaciondeladb = afectalainformaciondeladb;
        this.requiereafectarlaestructuradb = requiereafectarlaestructuradb;
        this.requiereserparteciclodesarrollo = requiereserparteciclodesarrollo;
        this.requiereperfilproyecto = requiereperfilproyecto;
        this.fecha = fecha;
    }

    public Integer getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(Integer idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getImpactoencasodenoatenderalcambio() {
        return impactoencasodenoatenderalcambio;
    }

    public void setImpactoencasodenoatenderalcambio(String impactoencasodenoatenderalcambio) {
        this.impactoencasodenoatenderalcambio = impactoencasodenoatenderalcambio;
    }

    public String getBeneficiosesperados() {
        return beneficiosesperados;
    }

    public void setBeneficiosesperados(String beneficiosesperados) {
        this.beneficiosesperados = beneficiosesperados;
    }

    public String getRazoncambio() {
        return razoncambio;
    }

    public void setRazoncambio(String razoncambio) {
        this.razoncambio = razoncambio;
    }

    public short getExisteafectaciondeladb() {
        return existeafectaciondeladb;
    }

    public void setExisteafectaciondeladb(short existeafectaciondeladb) {
        this.existeafectaciondeladb = existeafectaciondeladb;
    }

    public short getAfectalainformaciondeladb() {
        return afectalainformaciondeladb;
    }

    public void setAfectalainformaciondeladb(short afectalainformaciondeladb) {
        this.afectalainformaciondeladb = afectalainformaciondeladb;
    }

    public short getRequiereafectarlaestructuradb() {
        return requiereafectarlaestructuradb;
    }

    public void setRequiereafectarlaestructuradb(short requiereafectarlaestructuradb) {
        this.requiereafectarlaestructuradb = requiereafectarlaestructuradb;
    }

    public short getRequiereserparteciclodesarrollo() {
        return requiereserparteciclodesarrollo;
    }

    public void setRequiereserparteciclodesarrollo(short requiereserparteciclodesarrollo) {
        this.requiereserparteciclodesarrollo = requiereserparteciclodesarrollo;
    }

    public short getRequiereperfilproyecto() {
        return requiereperfilproyecto;
    }

    public void setRequiereperfilproyecto(short requiereperfilproyecto) {
        this.requiereperfilproyecto = requiereperfilproyecto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Collection<Respuestasolicitud> getRespuestasolicitudCollection() {
        return respuestasolicitudCollection;
    }

    public void setRespuestasolicitudCollection(Collection<Respuestasolicitud> respuestasolicitudCollection) {
        this.respuestasolicitudCollection = respuestasolicitudCollection;
    }

    public EnumPrioridad getEnumPrioridad() {
        return enumPrioridad;
    }

    public void setEnumPrioridad(EnumPrioridad enumPrioridad) {
        this.enumPrioridad = enumPrioridad;
    }

    public EnumTiporequerimientos getEnumTiporequerimientos() {
        return enumTiporequerimientos;
    }

    public void setEnumTiporequerimientos(EnumTiporequerimientos enumTiporequerimientos) {
        this.enumTiporequerimientos = enumTiporequerimientos;
    }

    public Sistemainformatica getSistemainformatica() {
        return sistemainformatica;
    }

    public void setSistemainformatica(Sistemainformatica sistemainformatica) {
        this.sistemainformatica = sistemainformatica;
    }

    public Sistemainformatica getSistemainformatica1() {
        return sistemainformatica1;
    }

    public void setSistemainformatica1(Sistemainformatica sistemainformatica1) {
        this.sistemainformatica1 = sistemainformatica1;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsolicitud != null ? idsolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.idsolicitud == null && other.idsolicitud != null) || (this.idsolicitud != null && !this.idsolicitud.equals(other.idsolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.Solicitud[ idsolicitud=" + idsolicitud + " ]";
    }
    
}
