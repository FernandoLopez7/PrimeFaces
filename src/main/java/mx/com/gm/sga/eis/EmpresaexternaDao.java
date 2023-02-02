/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Empresaexterna;

/**
 *
 * @author gabol
 */
@Local
public interface EmpresaexternaDao {

    void create(Empresaexterna empresaexterna);

    void edit(Empresaexterna empresaexterna);

    void remove(Empresaexterna empresaexterna);

    Empresaexterna find(Object id);

    List<Empresaexterna> findAll();

    List<Empresaexterna> findRange(int[] range);

    int count();
    
}
