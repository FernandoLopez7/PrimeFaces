/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Usuario;
import mx.com.gm.sga.eis.UsuarioDao;

/**
 *
 * @author gabol
 */
@Stateless
public class UsuarioServiceImpl implements UsuarioService, UsuarioServiceRemote {
    
    @Inject
    private UsuarioDao usuarioDao;
    
    @Override
    public void create(Usuario usuario) {
        usuarioDao.create(usuario);
    }

    @Override
    public void edit(Usuario usuario) {
        usuarioDao.create(usuario);
    }

    @Override
    public void remove(Usuario usuario) {
        usuarioDao.remove(usuario);
    }

    @Override
    public Usuario find(Object id) {
        return usuarioDao.find(id);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    @Override
    public List<Usuario> findRange(int[] range) {
        return usuarioDao.findRange(range);
    }

    @Override
    public int count() {
        return usuarioDao.count();
    }

    
    
}
