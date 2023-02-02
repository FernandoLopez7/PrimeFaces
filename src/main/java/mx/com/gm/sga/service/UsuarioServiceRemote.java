/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Usuario;

/**
 *
 * @author gabol
 */
@Remote
public interface UsuarioServiceRemote {

    public void create(Usuario usuario);

    public void edit(Usuario usuario);

    public void remove(Usuario usuario);

    public Usuario find(Object id);

    public List<Usuario> findAll();

    public List<Usuario> findRange(int[] range);

    public int count();
    
}
