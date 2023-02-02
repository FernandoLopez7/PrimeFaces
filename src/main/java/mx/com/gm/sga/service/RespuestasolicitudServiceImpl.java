/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Respuestasolicitud;
import mx.com.gm.sga.eis.RespuestasolicitudDao;

/**
 *
 * @author gabol
 */
@Stateless
public class RespuestasolicitudServiceImpl implements RespuestasolicitudService, RespuestasolicitudServiceRemote {
    
    @Inject
    private RespuestasolicitudDao respuestasolicitudDao;
    
    @Override
    public void create(Respuestasolicitud respuestasolicitud) {
        respuestasolicitudDao.create(respuestasolicitud);
    }

    @Override
    public void edit(Respuestasolicitud respuestasolicitud) {
        respuestasolicitudDao.edit(respuestasolicitud);
    }

    @Override
    public void remove(Respuestasolicitud respuestasolicitud) {
        respuestasolicitudDao.remove(respuestasolicitud);
    }

    @Override
    public Respuestasolicitud find(Object id) {
        return respuestasolicitudDao.find(id);
    }

    @Override
    public List<Respuestasolicitud> findAll() {
        return respuestasolicitudDao.findAll();
    }

    @Override
    public List<Respuestasolicitud> findRange(int[] range) {
        return respuestasolicitudDao.findRange(range);
    }

    @Override
    public int count() {
        return respuestasolicitudDao.count();
    }
    
}
