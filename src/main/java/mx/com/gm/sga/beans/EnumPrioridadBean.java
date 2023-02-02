package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.EnumPrioridad;
import mx.com.gm.sga.service.EnumPrioridadService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabol
 */
@Named("enumPrioridadBean")
@RequestScoped
public class EnumPrioridadBean {

    @Inject
    private EnumPrioridadService enumPrioridadService;

    private EnumPrioridad enumPrioridadSeleccionada;

    List<EnumPrioridad> enumPrioridades;

    public EnumPrioridadBean() {
    }
    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        enumPrioridades = enumPrioridadService.findAll();
        enumPrioridadSeleccionada = new EnumPrioridad();
    }

    public void editListener(RowEditEvent event) {
        EnumPrioridad enumPrioridad = (EnumPrioridad) event.getObject();
        enumPrioridadService.edit(enumPrioridad);
    }

    public List<EnumPrioridad> getEnumPrioridades() {
        return enumPrioridades;
    }

    public void setEnumPrioridades(List<EnumPrioridad> enumPrioridades) {
        this.enumPrioridades = enumPrioridades;
    }

    public EnumPrioridad getEnumPrioridadSeleccionada() {
        return enumPrioridadSeleccionada;
    }

    public void setEnumPrioridadSeleccionada(EnumPrioridad enumPrioridadSeleccionada) {
        this.enumPrioridadSeleccionada = enumPrioridadSeleccionada;
    }

    public void reiniciarEnumPrioridadSeleccionada() {
        this.enumPrioridadSeleccionada = new EnumPrioridad();
    }

    public void agregarEnumPrioridad() {
        enumPrioridadService.create(this.enumPrioridadSeleccionada);
        this.enumPrioridadSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarEnumPrioridad() {
        enumPrioridadService.remove(this.enumPrioridadSeleccionada);
        this.enumPrioridadSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public EnumPrioridadService getEnumPrioridadService() {
        return enumPrioridadService;
    }

    public void setEnumPrioridadService(EnumPrioridadService enumPrioridadService) {
        this.enumPrioridadService = enumPrioridadService;
    }
}
