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
import timeAttendance.Service.IEmpreinte;
import timeAttendance.data.Empreinte;

/**
 *
 * @author simo
 */
@ManagedBean
@RequestScoped
public class EmpreinteBean {
    
    @ManagedProperty(value = "#{IEmpreinte}")
    IEmpreinte iEmpreinte;
    
    Empreinte empreinte= new Empreinte();
    
     public IEmpreinte getiEmpreinte() {
        return iEmpreinte;
    }

    public void setiEmpreinte(IEmpreinte iEmpreinte) {
        this.iEmpreinte = iEmpreinte;
    }

    public Empreinte getEmpreinte() {
        return empreinte;
    }

    public void setEmpreinte(Empreinte empreinte) {
        this.empreinte = empreinte;
    }

    public EmpreinteBean() {
    }
    

 public Empreinte createEmpreinte(){
      return iEmpreinte.createEmpreinte(empreinte);
    }
    public Empreinte updateEmpreinte(){
      return iEmpreinte.updateEmpreinte(empreinte);
    }
    public Empreinte findEmpreinteById(){
       return iEmpreinte.findEmpreinteById(empreinte.getId());
    }
    public List<Empreinte> findAllEmpreinte(){
       return iEmpreinte.findAllEmpreinte();
    }
    
    
}
