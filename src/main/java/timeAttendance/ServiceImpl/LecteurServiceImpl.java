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
import timeAttendance.Dao.ILecteurDao;
import timeAttendance.Service.ILecteur;
import timeAttendance.data.Lecteur;

/**
 *
 * @author simo
 */
public class LecteurServiceImpl implements ILecteur{
    
    ILecteurDao iLecteurDao;

    public ILecteurDao getiLecteurDao() {
        return iLecteurDao;
    }

    public void setiLecteurDao(ILecteurDao iLecteurDao) {
        this.iLecteurDao = iLecteurDao;
    }

    public Lecteur createLecteur(Lecteur lecteur) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iLecteurDao.create(lecteur);
        } catch (DataAccessException ex) {
            Logger.getLogger(LecteurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

    public Lecteur updateLecteur(Lecteur lecteur) {
       try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iLecteurDao.update(lecteur);
        } catch (DataAccessException ex) {
            Logger.getLogger(LecteurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Lecteur deleteLecteur(Lecteur lecteur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Lecteur findLecteurById(Long Id) {
     try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iLecteurDao.findById(Id);
        } catch (DataAccessException ex) {
            Logger.getLogger(LecteurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    public List<Lecteur> findAllLecteur() {
       try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iLecteurDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(LecteurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void ecrireSurLecteur(Lecteur lecteur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String lireSurLecteur(Lecteur lecteur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void nettoyerLecteur(Lecteur lecteur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
