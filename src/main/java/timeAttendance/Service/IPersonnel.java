/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import timeAttendance.data.Personnel;

/**
 *
 * @author simo
 */
@Transactional
public interface IPersonnel {
    public Personnel createPersonnel(Personnel personnel);
    public Personnel updatePersonnel(Personnel personnel);
    public void deletePersonnel(Personnel personnel);
    public Personnel findPersonnelById(Long Id);
    public List<Personnel> findAllPersonnel();
    public void envoyerNotification(Personnel personnel);
   
}
