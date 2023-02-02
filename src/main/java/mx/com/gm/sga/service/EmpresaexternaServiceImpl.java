/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Empresaexterna;
import mx.com.gm.sga.eis.EmpresaexternaDao;

/**
 *
 * @author gabol
 */
@Stateless
public class EmpresaexternaServiceImpl implements EmpresaexternaService, EmpresaexternaServiceRemote {
    
    @Inject
    private EmpresaexternaDao empresaexternaDao;
    
    @Override
    public void create(Empresaexterna empresaexterna) {
        empresaexternaDao.create(empresaexterna);
    }

    @Override
    public void edit(Empresaexterna empresaexterna) {
        empresaexternaDao.edit(empresaexterna);
    }

    @Override
    public void remove(Empresaexterna empresaexterna) {
        empresaexternaDao.remove(empresaexterna);
    }

    @Override
    public Empresaexterna find(Object id) {
        return empresaexternaDao.find(id);
    }

    @Override
    public List<Empresaexterna> findAll() {
        return empresaexternaDao.findAll();
    }

    @Override
    public List<Empresaexterna> findRange(int[] range) {
        return empresaexternaDao.findRange(range);
    }

    @Override
    public int count() {
        return empresaexternaDao.count();
    }
}
