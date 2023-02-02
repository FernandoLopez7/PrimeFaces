/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.EnumTiporequerimientos;
import mx.com.gm.sga.eis.EnumTiporequerimientosDao;
/**
 *
 * @author gabol
 */
@Stateless
public class EnumTiporequerimientosServiceImpl implements EnumTiporequerimientosService, EnumTiporequerimientosServiceRemote {
    
    @Inject
    private EnumTiporequerimientosDao enumTiporequerimientosDao;
    
    @Override
    public void create(EnumTiporequerimientos enumTiporequerimientos) {
        enumTiporequerimientosDao.create(enumTiporequerimientos);
    }

    @Override
    public void edit(EnumTiporequerimientos enumTiporequerimientos) {
        enumTiporequerimientosDao.edit(enumTiporequerimientos);
    }

    @Override
    public void remove(EnumTiporequerimientos enumTiporequerimientos) {
        enumTiporequerimientosDao.remove(enumTiporequerimientos);
    }

    @Override
    public EnumTiporequerimientos find(Object id) {
        return enumTiporequerimientosDao.find(id);
    }

    @Override
    public List<EnumTiporequerimientos> findAll() {
        return enumTiporequerimientosDao.findAll();
    }

    @Override
    public List<EnumTiporequerimientos> findRange(int[] range) {
        return enumTiporequerimientosDao.findRange(range);
    }

    @Override
    public int count() {
        return enumTiporequerimientosDao.count();
    }

    
}
