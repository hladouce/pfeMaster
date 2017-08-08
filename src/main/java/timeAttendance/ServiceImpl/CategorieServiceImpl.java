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
import timeAttendance.Dao.ICategorieDao;
import timeAttendance.Service.ICategorie;
import timeAttendance.data.Categorie;

/**
 *
 * @author simo
 */
public class CategorieServiceImpl implements ICategorie{
    
    ICategorieDao iCategorieDao;

    public ICategorieDao getiCategorieDao() {
        return iCategorieDao;
    }

    public void setiCategorieDao(ICategorieDao iCategorieDao) {
        this.iCategorieDao = iCategorieDao;
    }
    
    

    public Categorie createCategorie(Categorie categorie) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iCategorieDao.create(categorie);
        } catch (DataAccessException ex) {
            Logger.getLogger(CategorieServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Categorie updateCategorie(Categorie categorie) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iCategorieDao.update(categorie);
        } catch (DataAccessException ex) {
            Logger.getLogger(CategorieServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
}

    public void deleteCategorie(Categorie categorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Categorie findCategorieById(Long Id) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iCategorieDao.findById(Id);
        } catch (DataAccessException ex) {
            Logger.getLogger(CategorieServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Categorie> findAllCategorie() {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iCategorieDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(CategorieServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
