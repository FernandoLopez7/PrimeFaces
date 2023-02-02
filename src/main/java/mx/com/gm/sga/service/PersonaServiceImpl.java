/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.eis.PersonaDao;

/**
 *
 * @author gabol
 */
@Stateless
public class PersonaServiceImpl implements PersonaService, PersonaServiceRemote {

    @Inject
    private PersonaDao personaDao;
    
    @Override
    public void create(Persona persona) {
        personaDao.create(persona);
    }

    @Override
    public void edit(Persona persona) {
        personaDao.edit(persona);
    }

    @Override
    public void remove(Persona persona) {
        personaDao.remove(persona);
    }

    @Override
    public Persona find(Object id) {
        return personaDao.find(id);
    }

    @Override
    public List<Persona> findAll() {
        return personaDao.findAll();
    }

    @Override
    public List<Persona> findRange(int[] range) {
        return personaDao.findRange(range);
    }

    @Override
    public int count() {
        return personaDao.count();
    }

    
}
