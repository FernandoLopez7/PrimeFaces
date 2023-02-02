/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Tecnico;
import mx.com.gm.sga.eis.TecnicoDao;

/**
 *
 * @author gabol
 */
@Stateless
public class TecnicoServiceImpl implements TecnicoService, TecnicoServiceRemote {
    
    @Inject
    private TecnicoDao tecnicoDao;
    
    @Override
    public void create(Tecnico tecnico) {
        tecnicoDao.create(tecnico);
    }

    @Override
    public void edit(Tecnico tecnico) {
        tecnicoDao.edit(tecnico);
    }

    @Override
    public void remove(Tecnico tecnico) {
        tecnicoDao.remove(tecnico);
    }

    @Override
    public Tecnico find(Object id) {
        return tecnicoDao.find(id);
    }

    @Override
    public List<Tecnico> findAll() {
        return tecnicoDao.findAll();
    }

    @Override
    public List<Tecnico> findRange(int[] range) {
        return tecnicoDao.findRange(range);
    }

    @Override
    public int count() {
        return tecnicoDao.count();
    }

    
    
}
