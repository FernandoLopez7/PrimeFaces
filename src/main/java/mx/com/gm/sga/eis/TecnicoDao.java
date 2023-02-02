/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Tecnico;

/**
 *
 * @author gabol
 */
@Local
public interface TecnicoDao {

    void create(Tecnico tecnico);

    void edit(Tecnico tecnico);

    void remove(Tecnico tecnico);

    Tecnico find(Object id);

    List<Tecnico> findAll();

    List<Tecnico> findRange(int[] range);

    int count();
    
}
