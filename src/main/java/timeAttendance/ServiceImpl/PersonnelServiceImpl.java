/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.ServiceImpl;

import com.douwe.generic.dao.DataAccessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Transactional;
import timeAttendance.Dao.IPersonnelDao;
import timeAttendance.Service.IPersonnel;
import timeAttendance.data.Personnel;

/**
 *
 * @author simo
 */
@Transactional
public class PersonnelServiceImpl implements IPersonnel{
    
    IPersonnelDao iPersonnelDao;

    public IPersonnelDao getiPersonnelDao() {
        return iPersonnelDao;
    }

    public void setiPersonnelDao(IPersonnelDao iPersonnelDao) {
        this.iPersonnelDao = iPersonnelDao;
    }
    
    

    public Personnel createPersonnel(Personnel personnel) {
        
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iPersonnelDao.create(personnel);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonnelServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

    public Personnel updatePersonnel(Personnel personnel) {
        
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iPersonnelDao.update(personnel);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonnelServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
   return null;
    }

    public void deletePersonnel(Personnel personnel) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    public Personnel findPersonnelById(Long Id) {
        
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iPersonnelDao.findById(Id);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonnelServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Personnel> findAllPersonnel() {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iPersonnelDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonnelServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void envoyerNotification(Personnel personnel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

