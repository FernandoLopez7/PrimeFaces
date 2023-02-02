package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Empresaexterna;
import mx.com.gm.sga.service.EmpresaexternaService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabol
 */
@Named("empresaexternaBean")
@RequestScoped
public class EmpresaexternaBean {

    @Inject
    private EmpresaexternaService empresaexternaService;

    private Empresaexterna empresaexternaSeleccionada;

    List<Empresaexterna> empresaexternas;

    public EmpresaexternaBean() {
    }
    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        empresaexternas = empresaexternaService.findAll();
        empresaexternaSeleccionada = new Empresaexterna();
    }

    public void editListener(RowEditEvent event) {
        Empresaexterna empresaexterna = (Empresaexterna) event.getObject();
        empresaexternaService.edit(empresaexterna);
    }

    public List<Empresaexterna> getEmpresaexternas() {
        return empresaexternas;
    }

    public void setEmpresaexternas(List<Empresaexterna> empresaexternas) {
        this.empresaexternas = empresaexternas;
    }

    public Empresaexterna getEmpresaexternaSeleccionada() {
        return empresaexternaSeleccionada;
    }

    public void setEmpresaexternaSeleccionada(Empresaexterna empresaexternaSeleccionada) {
        this.empresaexternaSeleccionada = empresaexternaSeleccionada;
    }

    public void reiniciarEmpresaexternaSeleccionada() {
        this.empresaexternaSeleccionada = new Empresaexterna();
    }

    public void agregarEmpresaexterna() {
        empresaexternaService.create(this.empresaexternaSeleccionada);
        this.empresaexternaSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarEmpresaexterna() {
        empresaexternaService.remove(this.empresaexternaSeleccionada);
        this.empresaexternaSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public EmpresaexternaService getEmpresaexternaService() {
        return empresaexternaService;
    }

    public void setEmpresaexternaService(EmpresaexternaService empresaexternaService) {
        this.empresaexternaService = empresaexternaService;
    }
}
