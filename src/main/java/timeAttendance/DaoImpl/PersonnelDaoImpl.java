/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.DaoImpl;

import com.douwe.generic.dao.impl.GenericDao;
import timeAttendance.Dao.IPersonnelDao;
import timeAttendance.data.Personnel;

/**
 *
 * @author simo
 */
public class PersonnelDaoImpl extends GenericDao<Personnel, Long> implements IPersonnelDao{

    public void envoyerNotification(Personnel personnel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
