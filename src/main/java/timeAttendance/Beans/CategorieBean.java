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
import timeAttendance.Service.ICategorie;
import timeAttendance.data.Categorie;

/**
 *
 * @author simo
 */
@ManagedBean
@RequestScoped
public class CategorieBean {
    
     @ManagedProperty(value = "#{ICategorie}")
    private ICategorie iCategorie;
      
    
    Categorie categorie = new Categorie();
    
     public ICategorie getiCategorie() {
        return iCategorie;
    }

    public void setiCategorie(ICategorie iCategorie) {
        this.iCategorie = iCategorie;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
       
    public Categorie createCategorie(){
      return iCategorie.createCategorie(categorie);
    }
    public Categorie updateCategorie(){
      return iCategorie.updateCategorie(categorie);
    }
    public Categorie findCategorieById(){
       return iCategorie.findCategorieById(categorie.getId());
    }
    public List<Categorie> findAllCategorie(){
       return iCategorie.findAllCategorie();
    }

    public CategorieBean() {
    }
    
    
}
