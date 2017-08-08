/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.Dao;

import com.douwe.generic.dao.IDao;
import timeAttendance.data.Lecteur;

/**
 *
 * @author simo
 */
public interface ILecteurDao extends IDao<Lecteur,Long>{
    
        
    public void ecrireSurLecteur(Lecteur lecteur);
    public String lireSurLecteur(Lecteur lecteur);
    public void nettoyerLecteur(Lecteur lecteur);
    
}
