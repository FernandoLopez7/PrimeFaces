/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.EnumPrioridad;
import mx.com.gm.sga.eis.EnumPrioridadDao;

/**
 *
 * @author gabol
 */
@Stateless
public class EnumPrioridadServiceImpl implements EnumPrioridadService, EnumPrioridadServiceRemote{
    
    @Inject
    private EnumPrioridadDao enumPrioridadDao;
    
    @Override
    public void create(EnumPrioridad enumPrioridad) {
        enumPrioridadDao.create(enumPrioridad);
    }

    @Override
    public void edit(EnumPrioridad enumPrioridad) {
        enumPrioridadDao.edit(enumPrioridad);
    }

    @Override
    public void remove(EnumPrioridad enumPrioridad) {
        enumPrioridadDao.remove(enumPrioridad);
    }

    @Override
    public EnumPrioridad find(Object id) {
        return enumPrioridadDao.find(id);
    }

    @Override
    public List<EnumPrioridad> findAll() {
        return enumPrioridadDao.findAll();
    }

    @Override
    public List<EnumPrioridad> findRange(int[] range) {
        return enumPrioridadDao.findRange(range);
    }

    @Override
    public int count() {
        return enumPrioridadDao.count();
    }

    
    
}
