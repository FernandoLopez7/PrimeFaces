/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.EnumPrioridad;

/**
 *
 * @author gabol
 */
@Remote
public interface EnumPrioridadServiceRemote {

    public void create(EnumPrioridad enumPrioridad);

    public void edit(EnumPrioridad enumPrioridad);

    public void remove(EnumPrioridad enumPrioridad);

    public EnumPrioridad find(Object id);

    public List<EnumPrioridad> findAll();

    public List<EnumPrioridad> findRange(int[] range);

    public int count();
    
}
