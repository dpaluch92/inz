/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.inz.service;

import projekt.inz.pojo.Pacjent;
import java.util.List;

/**
 *
 * @author depek
 */

public interface PacjentService {

    List<Pacjent> getAll();

    void add(Pacjent pacjent);

    void edit(Pacjent pacjent);

    void delete(int idPacjenta);

    Pacjent getPacjent(int idPacjenta);
    
    Pacjent getPacjent(String username);
    
    Pacjent loginPacjent(String login, String haslo);
}
