/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Tecnico;

/**
 *
 * @author gabol
 */
@Local
public interface TecnicoService {

    public void create(Tecnico tecnico);

    public void edit(Tecnico tecnico);

    public void remove(Tecnico tecnico);

    public Tecnico find(Object id);

    public List<Tecnico> findAll();

    public List<Tecnico> findRange(int[] range);

    public int count();
    
}
