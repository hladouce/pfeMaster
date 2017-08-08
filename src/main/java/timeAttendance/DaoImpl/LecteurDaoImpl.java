/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.DaoImpl;

import com.douwe.generic.dao.impl.GenericDao;
import timeAttendance.Dao.ILecteurDao;
import timeAttendance.data.Lecteur;

/**
 *
 * @author simo
 */
public class LecteurDaoImpl extends GenericDao<Lecteur, Long> implements ILecteurDao{

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
