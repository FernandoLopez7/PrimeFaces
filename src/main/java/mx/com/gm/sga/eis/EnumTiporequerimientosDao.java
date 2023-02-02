/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.EnumTiporequerimientos;

/**
 *
 * @author gabol
 */
@Local
public interface EnumTiporequerimientosDao {

    void create(EnumTiporequerimientos enumTiporequerimientos);

    void edit(EnumTiporequerimientos enumTiporequerimientos);

    void remove(EnumTiporequerimientos enumTiporequerimientos);

    EnumTiporequerimientos find(Object id);

    List<EnumTiporequerimientos> findAll();

    List<EnumTiporequerimientos> findRange(int[] range);

    int count();
    
}
