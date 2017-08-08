/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeAttendance.Beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import timeAttendance.Service.IPointage;
import timeAttendance.data.Pointage;

/**
 *
 * @author simo
 */
@ManagedBean
@RequestScoped
public class PointageBean {
    
    @ManagedProperty(value = "#{IPointage}")
    private IPointage iPointage;
    
    Pointage pointage = new Pointage();

    public IPointage getiPointage() {
        return iPointage;
    }

    public void setiPointage(IPointage iPointage) {
        this.iPointage = iPointage;
    }

    public Pointage getPointage() {
        return pointage;
    }

    public void setPointage(Pointage pointage) {
        this.pointage = pointage;
    }

    public PointageBean() {
    }
    
      public Pointage createPointage(){
      return iPointage.createPointage(pointage);
    }
    public Pointage updatePointage(){
      return iPointage.updatePointage(pointage);
    }
    public Pointage findPointageById(){
       return iPointage.findPointageById(pointage.getId());
    }
    public List<Pointage> findAllPointage(){
       return iPointage.findAllPointage();
    }

    
}
