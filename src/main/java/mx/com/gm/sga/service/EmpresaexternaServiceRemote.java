/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Empresaexterna;

/**
 *
 * @author gabol
 */
@Remote
public interface EmpresaexternaServiceRemote {

    public void create(Empresaexterna empresaexterna);

    public void edit(Empresaexterna empresaexterna);

    public void remove(Empresaexterna empresaexterna);

    public Empresaexterna find(Object id);

    public List<Empresaexterna> findAll();

    public List<Empresaexterna> findRange(int[] range);

    public int count();
    
}
