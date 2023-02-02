/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Persona;

/**
 *
 * @author gabol
 */
@Remote
public interface PersonaServiceRemote {

    public void create(Persona persona);

    public void edit(Persona persona);

    public void remove(Persona persona);

    public Persona find(Object id);

    public List<Persona> findAll();

    public List<Persona> findRange(int[] range);

    public int count();
    
}
