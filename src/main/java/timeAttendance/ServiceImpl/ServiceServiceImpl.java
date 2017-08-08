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
import timeAttendance.Dao.IServiceDao;
import timeAttendance.Service.IService;
import timeAttendance.data.Service;

/**
 *
 * @author simo
 */
public class ServiceServiceImpl implements IService{

    IServiceDao iServiceDao;

    public IServiceDao getiServiceDao() {
        return iServiceDao;
    }

    public void setiServiceDao(IServiceDao iServiceDao) {
        this.iServiceDao = iServiceDao;
    }
    
    
    
    public Service createService(Service service) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iServiceDao.create(service);
        } catch (DataAccessException ex) {
            Logger.getLogger(ServiceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Service updateService(Service service) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iServiceDao.update(service);
        } catch (DataAccessException ex) {
            Logger.getLogger(ServiceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Service deleteService(Service service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Service findServiceById(Long Id) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iServiceDao.findById(Id);
        } catch (DataAccessException ex) {
            Logger.getLogger(ServiceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Service> findAllService() {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iServiceDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(ServiceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
}
