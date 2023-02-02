package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.EnumTiporequerimientos;
import mx.com.gm.sga.service.EnumTiporequerimientosService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabol
 */
@Named("enumTiporequerimientosBean")
@RequestScoped
public class EnumTiporequerimientosBean {

    @Inject
    private EnumTiporequerimientosService enumTiporequerimientosService;

    private EnumTiporequerimientos enumTiporequerimientosSeleccionada;

    List<EnumTiporequerimientos> enumTiporequerimientoss;

    public EnumTiporequerimientosBean() {
    }
    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        enumTiporequerimientoss = enumTiporequerimientosService.findAll();
        enumTiporequerimientosSeleccionada = new EnumTiporequerimientos();
    }

    public void editListener(RowEditEvent event) {
        EnumTiporequerimientos enumTiporequerimientos = (EnumTiporequerimientos) event.getObject();
        enumTiporequerimientosService.edit(enumTiporequerimientos);
    }

    public List<EnumTiporequerimientos> getEnumTiporequerimientoss() {
        return enumTiporequerimientoss;
    }

    public void setEnumTiporequerimientoss(List<EnumTiporequerimientos> enumTiporequerimientoss) {
        this.enumTiporequerimientoss = enumTiporequerimientoss;
    }

    public EnumTiporequerimientos getEnumTiporequerimientosSeleccionada() {
        return enumTiporequerimientosSeleccionada;
    }

    public void setEnumTiporequerimientosSeleccionada(EnumTiporequerimientos enumTiporequerimientosSeleccionada) {
        this.enumTiporequerimientosSeleccionada = enumTiporequerimientosSeleccionada;
    }

    public void reiniciarEnumTiporequerimientosSeleccionada() {
        this.enumTiporequerimientosSeleccionada = new EnumTiporequerimientos();
    }

    public void agregarEnumTiporequerimientos() {
        enumTiporequerimientosService.create(this.enumTiporequerimientosSeleccionada);
        this.enumTiporequerimientosSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarEnumTiporequerimientos() {
        enumTiporequerimientosService.remove(this.enumTiporequerimientosSeleccionada);
        this.enumTiporequerimientosSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public EnumTiporequerimientosService getEnumTiporequerimientosService() {
        return enumTiporequerimientosService;
    }

    public void setEnumTiporequerimientosService(EnumTiporequerimientosService enumTiporequerimientosService) {
        this.enumTiporequerimientosService = enumTiporequerimientosService;
    }
}
