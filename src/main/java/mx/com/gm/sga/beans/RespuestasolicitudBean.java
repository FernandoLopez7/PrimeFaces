package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Respuestasolicitud;
import mx.com.gm.sga.service.RespuestasolicitudService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabol
 */
@Named("respuestasolicitudBean")
@RequestScoped
public class RespuestasolicitudBean {

    @Inject
    private RespuestasolicitudService respuestasolicitudService;

    private Respuestasolicitud respuestasolicitudSeleccionada;

    List<Respuestasolicitud> respuestasolicitudes;

    public RespuestasolicitudBean() {
    }
    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        respuestasolicitudes = respuestasolicitudService.findAll();
        respuestasolicitudSeleccionada = new Respuestasolicitud();
    }

    public void editListener(RowEditEvent event) {
        Respuestasolicitud respuestasolicitud = (Respuestasolicitud) event.getObject();
        respuestasolicitudService.edit(respuestasolicitud);
    }

    public List<Respuestasolicitud> getRespuestasolicitudes() {
        return respuestasolicitudes;
    }

    public void setRespuestasolicitudes(List<Respuestasolicitud> respuestasolicitudes) {
        this.respuestasolicitudes = respuestasolicitudes;
    }

    public Respuestasolicitud getRespuestasolicitudSeleccionada() {
        return respuestasolicitudSeleccionada;
    }

    public void setRespuestasolicitudSeleccionada(Respuestasolicitud respuestasolicitudSeleccionada) {
        this.respuestasolicitudSeleccionada = respuestasolicitudSeleccionada;
    }

    public void reiniciarRespuestasolicitudSeleccionada() {
        this.respuestasolicitudSeleccionada = new Respuestasolicitud();
    }

    public void agregarRespuestasolicitud() {
        respuestasolicitudService.create(this.respuestasolicitudSeleccionada);
        this.respuestasolicitudSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarRespuestasolicitud() {
        respuestasolicitudService.remove(this.respuestasolicitudSeleccionada);
        this.respuestasolicitudSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public RespuestasolicitudService getRespuestasolicitudService() {
        return respuestasolicitudService;
    }

    public void setRespuestasolicitudService(RespuestasolicitudService respuestasolicitudService) {
        this.respuestasolicitudService = respuestasolicitudService;
    }
}
