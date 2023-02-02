/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Solicitud;

/**
 *
 * @author gabol
 */
@Remote
public interface SolicitudServiceRemote {

    public void create(Solicitud solicitud);

    public void edit(Solicitud solicitud);

    public void remove(Solicitud solicitud);

    public Solicitud find(Object id);

    public List<Solicitud> findAll();

    public List<Solicitud> findRange(int[] range);

    public int count();
    
}
