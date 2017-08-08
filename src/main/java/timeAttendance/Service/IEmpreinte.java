/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import timeAttendance.data.Empreinte;

/**
 *
 * @author simo
 */
@Transactional
public interface IEmpreinte {
    
    public Empreinte createEmpreinte(Empreinte empreinte);
    public Empreinte updateEmpreinte(Empreinte empreinte);
    public void deleteEmpreinte(Empreinte empreinte);
    public Empreinte findEmpreinteById(Long Id);
    public List<Empreinte> findAllEmpreinte();
    
}

