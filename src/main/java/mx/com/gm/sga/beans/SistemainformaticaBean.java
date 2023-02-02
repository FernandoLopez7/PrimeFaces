package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Sistemainformatica;
import mx.com.gm.sga.service.SistemainformaticaService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabol
 */
@Named("sistemainformaticaBean")
@RequestScoped
public class SistemainformaticaBean {

    @Inject
    private SistemainformaticaService sistemainformaticaService;

    private Sistemainformatica sistemainformaticaSeleccionada;

    List<Sistemainformatica> sistemainformaticas;

    public SistemainformaticaBean() {
    }
    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        sistemainformaticas = sistemainformaticaService.findAll();
        sistemainformaticaSeleccionada = new Sistemainformatica();
    }

    public void editListener(RowEditEvent event) {
        Sistemainformatica sistemainformatica = (Sistemainformatica) event.getObject();
        sistemainformaticaService.edit(sistemainformatica);
    }

    public List<Sistemainformatica> getSistemainformaticas() {
        return sistemainformaticas;
    }

    public void setSistemainformaticas(List<Sistemainformatica> sistemainformaticas) {
        this.sistemainformaticas = sistemainformaticas;
    }

    public Sistemainformatica getSistemainformaticaSeleccionada() {
        return sistemainformaticaSeleccionada;
    }

    public void setSistemainformaticaSeleccionada(Sistemainformatica sistemainformaticaSeleccionada) {
        this.sistemainformaticaSeleccionada = sistemainformaticaSeleccionada;
    }

    public void reiniciarSistemainformaticaSeleccionada() {
        this.sistemainformaticaSeleccionada = new Sistemainformatica();
    }

    public void agregarSistemainformatica() {
        sistemainformaticaService.create(this.sistemainformaticaSeleccionada);
        this.sistemainformaticaSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarSistemainformatica() {
        sistemainformaticaService.remove(this.sistemainformaticaSeleccionada);
        this.sistemainformaticaSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public SistemainformaticaService getSistemainformaticaService() {
        return sistemainformaticaService;
    }

    public void setSistemainformaticaService(SistemainformaticaService sistemainformaticaService) {
        this.sistemainformaticaService = sistemainformaticaService;
    }
}
