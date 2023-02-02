/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Respuestasolicitud;

/**
 *
 * @author gabol
 */
@Local
public interface RespuestasolicitudDao {

    void create(Respuestasolicitud respuestasolicitud);

    void edit(Respuestasolicitud respuestasolicitud);

    void remove(Respuestasolicitud respuestasolicitud);

    Respuestasolicitud find(Object id);

    List<Respuestasolicitud> findAll();

    List<Respuestasolicitud> findRange(int[] range);

    int count();
    
}
