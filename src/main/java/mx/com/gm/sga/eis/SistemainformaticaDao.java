/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Sistemainformatica;

/**
 *
 * @author gabol
 */
@Local
public interface SistemainformaticaDao {

    void create(Sistemainformatica sistemainformatica);

    void edit(Sistemainformatica sistemainformatica);

    void remove(Sistemainformatica sistemainformatica);

    Sistemainformatica find(Object id);

    List<Sistemainformatica> findAll();

    List<Sistemainformatica> findRange(int[] range);

    int count();
    
}
