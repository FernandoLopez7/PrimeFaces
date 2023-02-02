/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.EnumPrioridad;

/**
 *
 * @author gabol
 */
@Local
public interface EnumPrioridadDao {

    void create(EnumPrioridad enumPrioridad);

    void edit(EnumPrioridad enumPrioridad);

    void remove(EnumPrioridad enumPrioridad);

    EnumPrioridad find(Object id);

    List<EnumPrioridad> findAll();

    List<EnumPrioridad> findRange(int[] range);

    int count();
    
}
