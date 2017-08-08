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
import timeAttendance.Service.ILecteur;
import timeAttendance.data.Lecteur;

/**
 *
 * @author simo
 */
@ManagedBean
@RequestScoped
public class LecteurBean {
    
         @ManagedProperty(value = "#{ILecteur}")
    private ILecteur iLecteur;
    
    Lecteur lecteur = new Lecteur();
    
     public ILecteur getiLecteur() {
        return iLecteur;
    }

    public void setiLecteur(ILecteur iLecteur) {
        this.iLecteur = iLecteur;
    }

    public Lecteur getLecteur() {
        return lecteur;
    }

    public void setLecteur(Lecteur lecteur) {
        this.lecteur = lecteur;
    }
    
    public Lecteur createLecteur(){
      return iLecteur.createLecteur(lecteur);
    }
    public Lecteur updateLecteur(){
      return iLecteur.updateLecteur(lecteur);
    }
    public Lecteur findLecteurById(){
       return iLecteur.findLecteurById(lecteur.getId());
    }
    public List<Lecteur> findAllLecteur(){
       return iLecteur.findAllLecteur();
    }
     public void ecrireSurLecteur(Lecteur lecteur){
         
     }
    public String lireSurLecteur(Lecteur lecteur){
       return iLecteur.lireSurLecteur(lecteur);
    }
    public void nettoyerLecteur(Lecteur lecteur){
        
    }

    public LecteurBean() {
    }
    
    
    
}
