package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Tecnico;
import mx.com.gm.sga.service.TecnicoService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabol
 */
@Named("tecnicoBean")
@RequestScoped
public class TecnicoBean {

    @Inject
    private TecnicoService tecnicoService;

    private Tecnico tecnicoSeleccionada;

    List<Tecnico> tecnicos;

    public TecnicoBean() {
    }
    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        tecnicos = tecnicoService.findAll();
        tecnicoSeleccionada = new Tecnico();
    }

    public void editListener(RowEditEvent event) {
        Tecnico tecnico = (Tecnico) event.getObject();
        tecnicoService.edit(tecnico);
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public Tecnico getTecnicoSeleccionada() {
        return tecnicoSeleccionada;
    }

    public void setTecnicoSeleccionada(Tecnico tecnicoSeleccionada) {
        this.tecnicoSeleccionada = tecnicoSeleccionada;
    }

    public void reiniciarTecnicoSeleccionada() {
        this.tecnicoSeleccionada = new Tecnico();
    }

    public void agregarTecnico() {
        tecnicoService.create(this.tecnicoSeleccionada);
        this.tecnicoSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
        System.out.println(tecnicos);
    }

    public void eliminarTecnico() {
        tecnicoService.remove(this.tecnicoSeleccionada);
        this.tecnicoSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public TecnicoService getTecnicoService() {
        return tecnicoService;
    }

    public void setTecnicoService(TecnicoService tecnicoService) {
        this.tecnicoService = tecnicoService;
    }
}
