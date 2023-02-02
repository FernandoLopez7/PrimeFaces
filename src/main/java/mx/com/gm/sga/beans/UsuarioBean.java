package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Usuario;
import mx.com.gm.sga.service.UsuarioService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabol
 */
@Named("usuarioBean")
@RequestScoped
public class UsuarioBean {

    @Inject
    private UsuarioService usuarioService;

    private Usuario usuarioSeleccionada;

    List<Usuario> usuarios;

    public UsuarioBean() {
    }
    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        usuarios = usuarioService.findAll();
        usuarioSeleccionada = new Usuario();
    }

    public void editListener(RowEditEvent event) {
        Usuario usuario = (Usuario) event.getObject();
        usuarioService.edit(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario getUsuarioSeleccionada() {
        return usuarioSeleccionada;
    }

    public void setUsuarioSeleccionada(Usuario usuarioSeleccionada) {
        this.usuarioSeleccionada = usuarioSeleccionada;
    }

    public void reiniciarUsuarioSeleccionada() {
        this.usuarioSeleccionada = new Usuario();
    }

    public void agregarUsuario() {
        usuarioService.create(this.usuarioSeleccionada);
        this.usuarioSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarUsuario() {
        usuarioService.remove(this.usuarioSeleccionada);
        this.usuarioSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
}
