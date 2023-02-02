/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.EnumTiporequerimientos;

/**
 *
 * @author gabol
 */
@Local
public interface EnumTiporequerimientosService {

    public void create(EnumTiporequerimientos enumTiporequerimientos);

    public void edit(EnumTiporequerimientos enumTiporequerimientos);

    public void remove(EnumTiporequerimientos enumTiporequerimientos);

    public EnumTiporequerimientos find(Object id);

    public List<EnumTiporequerimientos> findAll();

    public List<EnumTiporequerimientos> findRange(int[] range);

    public int count();
    
}
