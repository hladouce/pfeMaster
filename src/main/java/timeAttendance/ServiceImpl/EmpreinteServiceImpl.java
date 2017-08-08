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
import timeAttendance.Dao.IEmpreinteDao;
import timeAttendance.Service.IEmpreinte;
import timeAttendance.data.Empreinte;

/**
 *
 * @author simo
 */
public class EmpreinteServiceImpl implements IEmpreinte{
    
    IEmpreinteDao iEmpreinteDao;

    public IEmpreinteDao getiEmpreinteDao() {
        return iEmpreinteDao;
    }

    public void setiEmpreinteDao(IEmpreinteDao iEmpreinteDao) {
        this.iEmpreinteDao = iEmpreinteDao;
    }

    public Empreinte createEmpreinte(Empreinte empreinte) {
       try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEmpreinteDao.create(empreinte);
        } catch (DataAccessException ex) {
            Logger.getLogger(EmpreinteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Empreinte updateEmpreinte(Empreinte empreinte) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEmpreinteDao.update(empreinte);
        } catch (DataAccessException ex) {
            Logger.getLogger(EmpreinteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void deleteEmpreinte(Empreinte empreinte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Empreinte findEmpreinteById(Long Id) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEmpreinteDao.findById(Id);
        } catch (DataAccessException ex) {
            Logger.getLogger(EmpreinteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<Empreinte> findAllEmpreinte() {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEmpreinteDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(EmpreinteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
