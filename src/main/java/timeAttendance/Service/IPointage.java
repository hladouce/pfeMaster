/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import timeAttendance.data.Pointage;

/**
 *
 * @author simo
 */
@Transactional
public interface IPointage {
    
    public Pointage createPointage(Pointage pointage);
    public Pointage updatePointage(Pointage pointage);
    public Pointage deletePointage(Pointage pointage);
    public Pointage findPointageById(Long Id);
    public List<Pointage> findAllPointage();
    
    
}

