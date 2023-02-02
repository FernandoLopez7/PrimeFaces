/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Sistemainformatica;
import mx.com.gm.sga.eis.SistemainformaticaDao;

/**
 *
 * @author gabol
 */
@Stateless
public class SistemainformaticaServiceImpl implements SistemainformaticaService, SistemainformaticaServiceRemote {
    
    @Inject
    private SistemainformaticaDao sistemainformaticaDao;
    
    @Override
    public void create(Sistemainformatica sistemainformatica) {
        sistemainformaticaDao.create(sistemainformatica);
    }

    @Override
    public void edit(Sistemainformatica sistemainformatica) {
        sistemainformaticaDao.edit(sistemainformatica);
    }

    @Override
    public void remove(Sistemainformatica sistemainformatica) {
        sistemainformaticaDao.remove(sistemainformatica);
    }

    @Override
    public Sistemainformatica find(Object id) {
        return sistemainformaticaDao.find(id);
    }

    @Override
    public List<Sistemainformatica> findAll() {
        return sistemainformaticaDao.findAll();
    }

    @Override
    public List<Sistemainformatica> findRange(int[] range) {
        return sistemainformaticaDao.findRange(range);
    }

    @Override
    public int count() {
        return sistemainformaticaDao.count();
    }

    
    
}
