/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Solicitud;
import mx.com.gm.sga.eis.SolicitudDao;

/**
 *
 * @author gabol
 */
@Stateless
public class SolicitudServiceImpl implements SolicitudService, SolicitudServiceRemote {

    @Inject
    private SolicitudDao solicitudDao;
    
    @Override
    public void create(Solicitud solicitud) {
        solicitudDao.create(solicitud);
    }

    @Override
    public void edit(Solicitud solicitud) {
        solicitudDao.edit(solicitud);
    }

    @Override
    public void remove(Solicitud solicitud) {
        solicitudDao.remove(solicitud);
    }

    @Override
    public Solicitud find(Object id) {
        return solicitudDao.find(id);
    }

    @Override
    public List<Solicitud> findAll() {
        return solicitudDao.findAll();
    }

    @Override
    public List<Solicitud> findRange(int[] range) {
        return solicitudDao.findRange(range);
    }

    @Override
    public int count() {
        return solicitudDao.count();
    }

}
