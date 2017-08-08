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
import timeAttendance.Dao.IPointageDao;
import timeAttendance.Service.IPointage;
import timeAttendance.data.Pointage;

/**
 *
 * @author simo
 */
public class PointageServiceImpl implements IPointage{
    
    IPointageDao iPointageDao;

    public IPointageDao getiPointageDao() {
        return iPointageDao;
    }

    public void setiPointageDao(IPointageDao iPointageDao) {
        this.iPointageDao = iPointageDao;
    }
    
    

    public Pointage createPointage(Pointage pointage) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iPointageDao.create(pointage);
        } catch (DataAccessException ex) {
            Logger.getLogger(PointageServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Pointage updatePointage(Pointage pointage) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iPointageDao.update(pointage);
        } catch (DataAccessException ex) {
            Logger.getLogger(PointageServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Pointage deletePointage(Pointage pointage) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    }

    public Pointage findPointageById(Long Id) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iPointageDao.findById(Id);
        } catch (DataAccessException ex) {
            Logger.getLogger(PointageServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Pointage> findAllPointage() {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iPointageDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(PointageServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


}
