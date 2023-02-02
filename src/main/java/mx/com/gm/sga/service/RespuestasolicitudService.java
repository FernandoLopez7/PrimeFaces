/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.service;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Respuestasolicitud;

/**
 *
 * @author gabol
 */
@Local
public interface RespuestasolicitudService {

    public void create(Respuestasolicitud respuestasolicitud);

    public void edit(Respuestasolicitud respuestasolicitud);

    public void remove(Respuestasolicitud respuestasolicitud);

    public Respuestasolicitud find(Object id);

    public List<Respuestasolicitud> findAll();

    public List<Respuestasolicitud> findRange(int[] range);

    public int count();
    
}
