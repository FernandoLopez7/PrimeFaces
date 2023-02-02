/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Sistemainformatica;

/**
 *
 * @author gabol
 */
@Local
public interface SistemainformaticaService {

    public void create(Sistemainformatica sistemainformatica);

    public void edit(Sistemainformatica sistemainformatica);

    public void remove(Sistemainformatica sistemainformatica);

    public Sistemainformatica find(Object id);

    public List<Sistemainformatica> findAll();

    public List<Sistemainformatica> findRange(int[] range);

    public int count();
    
}
