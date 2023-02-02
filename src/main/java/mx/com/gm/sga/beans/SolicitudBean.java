package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Solicitud;
import mx.com.gm.sga.service.SolicitudService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabol
 */
@Named("solicitudBean")
@RequestScoped
public class SolicitudBean {

    @Inject
    private SolicitudService solicitudService;

    private Solicitud solicitudSeleccionada;

    List<Solicitud> solicitudes;

    public SolicitudBean() {
    }
    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        solicitudes = solicitudService.findAll();
        solicitudSeleccionada = new Solicitud();
    }

    public void editListener(RowEditEvent event) {
        Solicitud solicitud = (Solicitud) event.getObject();
        solicitudService.edit(solicitud);
    }

    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public Solicitud getSolicitudSeleccionada() {
        return solicitudSeleccionada;
    }

    public void setSolicitudSeleccionada(Solicitud solicitudSeleccionada) {
        this.solicitudSeleccionada = solicitudSeleccionada;
    }

    public void reiniciarSolicitudSeleccionada() {
        this.solicitudSeleccionada = new Solicitud();
    }

    public void agregarSolicitud() {
        solicitudService.create(this.solicitudSeleccionada);
        this.solicitudSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarSolicitud() {
        solicitudService.remove(this.solicitudSeleccionada);
        this.solicitudSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public SolicitudService getSolicitudService() {
        return solicitudService;
    }

    public void setSolicitudService(SolicitudService solicitudService) {
        this.solicitudService = solicitudService;
    }
}
